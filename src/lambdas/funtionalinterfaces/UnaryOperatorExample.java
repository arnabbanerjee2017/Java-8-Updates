package lambdas.funtionalinterfaces;

import java.util.function.UnaryOperator;

/**
 * @FunctionalInterface
 * public interface UnaryOperator<T> extends Function<T,T> {
 * }
 * 
 * @author ARNAB
 *
 */

public class UnaryOperatorExample {
	public static void main(String[] args) {
		int key = 10;
		
		System.out.println(getDouble(key, a -> a * 2));
		System.out.println(getDouble(key, getDouble()));
	}
	
	private static int getDouble(int value, UnaryOperator<Integer> unaryOperator) {
		return unaryOperator.apply(value);
	}
	
	private static UnaryOperator<Integer> getDouble() {
		return a -> a * 2;
	}
}
