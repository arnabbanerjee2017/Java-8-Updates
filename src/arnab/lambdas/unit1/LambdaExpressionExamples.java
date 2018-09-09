package arnab.lambdas.unit1;

interface Greet {
	void print();
}

interface Add {
	int add(int x, int b);
}

interface DoubleNumber {
	int makeDouble(int x);
}

interface WhichIsGreater {
	int which(int x, int y);
}

public class LambdaExpressionExamples {
	public static void main(String[] args) {
		Greet greet = () -> System.out.println("Hello World!");
		
		greet.print();
		
		greet(() -> System.out.println("My Lambda"));
		
		Add add = (int a, int b) -> a + b;
		System.out.println(add.add(5, 6));
		
		DoubleNumber first = a -> a * 2;
		System.out.println(first.makeDouble(55));
		makeDouble(5, a -> a * 3);
		
		WhichIsGreater which1 = (int a, int b) -> (a > b ? a : b);
		WhichIsGreater which2 = whichIsGreater();
		System.out.println(whichIsGreater(5, 6, (int a, int b) -> (a > b ? a : b)));
		System.out.println(which1.which(8, 7));
		System.out.println(which2.which(15, 12));
	}
	
	private static void greet(Greet greet) {
		greet.print();
	}
	
	private static void makeDouble(int no, DoubleNumber number) {
		System.out.println(number.makeDouble(no));
	}
	
	private static WhichIsGreater whichIsGreater() {
		return (int a, int b) -> (a > b ? a : b);
	}
	
	private static int whichIsGreater(int a, int b, WhichIsGreater which) {
		return which.which(a, b);
	}
}
