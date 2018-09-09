package arnab.lambdas.unit2;

import java.util.Date;
import java.util.function.BiConsumer;

public class GoodExceptionHandlingApproachExample {
	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		long startTime = new Date().getTime();
		
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
		
		long endTime = new Date().getTime();
		
		System.out.println(endTime - startTime);
	}
	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: someNumbers) {			
			consumer.accept(i, key);				
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (a, b) -> {
			try {
				consumer.accept(a, b);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException Occurred!");
			} catch (Exception e) {
				System.out.println("An Exception Occurred!");
			}
		};
	}
}
