package arnab.closures;

interface Process {
	void process(int i);
}

public class ClosuresExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//b = 30; // You can't reassign it as in Java 8, it is effectively final. If you reassign it, you cannot use it in below operations
		
		// Using anonymous class
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i + b);				
			}			
		});
		
		doProcess(a, i -> System.out.println(i + b));
		
	}
	
	private static void doProcess(int i, Process process) {
		process.process(i);
	}
}
