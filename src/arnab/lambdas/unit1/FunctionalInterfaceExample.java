package arnab.lambdas.unit1;

/**
 * All the interface which have only one abstract method are Functional Interfaces. So till now, what we have coded in
 * LambdaExpressionExample.java, RunnableExample.java, and TypeInferenceExample.java, all are Functional Interfaces. But if someone
 * adds another abstract method to those interfaces, it won't be Functional Interface. FTo restrict that, Java 8 provides an 
 * annotation - @FunctionalInterface, which is basically a marker annotation. It restricts any further method addition to those 
 * interfaces.
 * @author ARNAB
 *
 */

@FunctionalInterface
interface Greet2 {
	void print();
}

@FunctionalInterface
interface Add2 {
	int add(int x, int b);
}

@FunctionalInterface
interface DoubleNumber2 {
	int makeDouble(int x);
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Greet2 greet = () -> System.out.println("Hello World!");
		
		greet.print();
		
		greet(() -> System.out.println("My Lambda"));
		
		Add2 add = (int a, int b) -> a + b;
		System.out.println(add.add(5, 6));
		
		DoubleNumber2 first = a -> a * 2;
		System.out.println(first.makeDouble(55));
		makeDouble(5, a -> a * 3);
		
	}
	
	private static void greet(Greet2 greet) {
		greet.print();
	}
	
	private static void makeDouble(int no, DoubleNumber2 number) {
		System.out.println(number.makeDouble(no));
	}
}
