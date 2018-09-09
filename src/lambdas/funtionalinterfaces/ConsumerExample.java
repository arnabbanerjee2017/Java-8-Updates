package lambdas.funtionalinterfaces;

import java.util.function.Consumer;

/**
 * @FunctionalInterface 
 * public class Consumer<T> {
 * 		void accept(T t);
 * }
 * 
 * @author ARNAB
 *
 */

public class ConsumerExample {

	public static void main(String[] args) {
		String myName = "Arnab Banerjee";
		
		print(myName, value -> System.out.println(value.toUpperCase()));
		print(myName, System.out::println);
	}
	
	private static void print(String value, Consumer<String> consumer) {
		consumer.accept(value);
	}
	
}
