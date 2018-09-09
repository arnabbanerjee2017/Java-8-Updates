package arnab.lambdas.unit3;

public class MethodReferenceExample1 {
	public static void main(String[] args) {
		printMessage();
		
		Thread t1 = new Thread(() -> printMessage());
		t1.start();
		
		t1 = new Thread(MethodReferenceExample1::printMessage); // This is called Method Reference and it is similar to above lambda expression.
		t1.start();
	}
	
	private static void printMessage() {
		System.out.println("Hello World!");
	}
}
