package arnab.thisreference;

import java.util.Date;

interface Process {
	void process(int i);
}

public class ThisReferenceExample {
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		long startTime = new Date().getTime();
		
		thisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);
			}
			
			@Override
			public String toString() {
				return "This is the annonymous inner class.";
			}
		});
		
		long endTime1 = new Date().getTime();
		
		thisReferenceExample.doProcess(20, i -> {
			System.out.println("Value of i is " + i);
			// System.out.println(this);  // Cannot use this. This won't work.
		});
		
		long endTime2 = new Date().getTime();
		
		thisReferenceExample.execute();
		
		long endTime3 = new Date().getTime();
		
		System.out.println(endTime1-startTime);
		System.out.println(endTime2-endTime1);  // Lambda takes much longer time.
		System.out.println(endTime3-endTime2);  // Lambda takes much longer time.
	}
	
	public void doProcess(int i, Process process) {
		process.process(i);
	}
	
	public void execute() {
		doProcess(20, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);  // Cannot use this. This won't work.
		});
	}
}
