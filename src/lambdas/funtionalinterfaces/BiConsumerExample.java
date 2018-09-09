package lambdas.funtionalinterfaces;

import java.util.function.BiConsumer;

/**
 * @FunctionalInterface 
 * public class BiConsumer<T, U> {
 * 		void accept(T t, U u);
 * }
 * 
 * @author ARNAB
 *
 */

public class BiConsumerExample {
	public static void main(String[] args) {
		String myFirstName = "Arnab";
		String myLastName = "Banerjee";
		
		print(myFirstName, myLastName, (v1, v2) -> System.out.println(v1.toUpperCase() + " " + v2.toUpperCase()));
		
	}
	
	private static void print(String str1, String str2, BiConsumer<String, String> consumer) {
		consumer.accept(str1, str2);
	}
}
