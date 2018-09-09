package lambdas.funtionalinterfaces;

import java.util.function.BinaryOperator;

/**
 * @FunctionalInterface 
 * public interface BinaryOperator<T> extends BiFunction<T,T,T> {
 * }
 * 
 * @author ARNAB
 *
 */

public class BinaryOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(add(num1, num2, (a, b) -> a + b));
		System.out.println(add(num1, num2, add()));
	}
	
	private static BinaryOperator<Integer> add() {
		return (a, b) -> a + b;
	}
	
	private static Integer add(int value1, int value2, BinaryOperator<Integer> binaryOperator) {
		return binaryOperator.apply(value1, value2);
	}
}
