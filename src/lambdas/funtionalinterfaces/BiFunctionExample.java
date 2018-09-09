package lambdas.funtionalinterfaces;

import java.util.function.BiFunction;

/**
 * @FunctionalInterface 
 * public class BiFunction<T, U, R> {
 * 		R apply(T t, U u);
 * }
 * 
 * @author ARNAB
 *
 */

public class BiFunctionExample {
	public static void main(String [] args) {
		String myAFirstName = "Arnab";
		String myLastName = "Banerjee";
		
		System.out.println(count(myAFirstName, myLastName, (a, b) -> (a + " " + b).length()));
		System.out.println(count(myAFirstName, myLastName, count()));		
	}
	
	private static BiFunction<String, String, Integer> count() {
		return (a, b) -> (a + " " + b).length();
	}
	
	private static Integer count(String value1, String value2, BiFunction<String, String, Integer> function) {
		return function.apply(value1, value2);
	}
}
