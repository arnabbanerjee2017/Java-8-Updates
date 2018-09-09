package lambdas.funtionalinterfaces;

import java.util.function.Supplier;

/**
 * @FunctionalInterface 
 * public class Supplier<T> {
 * 		public T get();
 * }
 * 
 * @author ARNAB
 *
 */

public class SupplierExample {

	public static void main(String[] args) {
		String myName = "Arnab Banerjee";
		
		print(() -> myName.toUpperCase()); // using lambda
		print(myName::toUpperCase); // using method reference
		print(myName::toString); // using method reference
		print(() -> "Hello World!".toUpperCase()); // using lambda
		print("Hello World!"::toUpperCase); // using method reference
		print("Hello World!"::toString); // using method reference
	}
	
	private static void print(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}

}
