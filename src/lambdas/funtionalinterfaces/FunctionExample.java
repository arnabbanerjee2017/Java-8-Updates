package lambdas.funtionalinterfaces;

import java.util.function.Function;

/**
 * @FunctionalInterface 
 * public class Function<T, R> {
 * 		R apply(T t);
 * }
 * 
 * @author ARNAB
 *
 */

public class FunctionExample {
	public static void main(String [] args) {
		String myName = "Arnab Banerjee";
		
		System.out.println(count(myName, a -> a.length()));
		System.out.println(count(myName, count()));
	}
	
	private static Integer count(String value, Function<String, Integer> function) {
		return function.apply(value);
	}
	
	private static Function<String, Integer> count() {
		return a -> a.length();
	}
}
