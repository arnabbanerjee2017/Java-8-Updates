package lambdas.funtionalinterfaces;

import java.util.function.BiPredicate;

/**
 * @FunctionalInterface 
 * public class BiPredicate<T, U> {
 * 		boolean test(T t, U u);
 * }
 * 
 * @author ARNAB
 *
 */

public class BiPredicateExample {

	public static void main(String[] args) {
		String value1 = "Hello World!";
		String value2 = "hello world!!";
		
		test(value1, value2, (a, b) -> a.equalsIgnoreCase(b));
		

	}
	
	private static void test(String value1, String value2, BiPredicate<String, String> predicate) {
		if(predicate.test(value1, value2)) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAILURE");
		}
	}

}
