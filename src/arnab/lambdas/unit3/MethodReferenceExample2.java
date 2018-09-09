package arnab.lambdas.unit3;

interface Print {
	void print(String s);
}

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		printMessage("Hello World!", System.out::println);
	}
	
	private static void printMessage(String s, Print print) {
		print.print(s);
	}
}
