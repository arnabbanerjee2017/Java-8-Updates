package arnab.lambdas.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> System.out.println("Hello World"));
		t.start();
		
		
	}

}
