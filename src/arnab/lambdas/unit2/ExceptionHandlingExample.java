package arnab.lambdas.unit2;

import java.util.Date;
import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		long startTime = new Date().getTime();
		
		process(someNumbers, key, (v, k) -> {
			try {
				System.out.println(v / k);
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero is not supported!");
			}			
		});
		
		long endTime = new Date().getTime();
		
		System.out.println(endTime - startTime);
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: someNumbers) {			
			consumer.accept(i, key);				
		}
	}
}
