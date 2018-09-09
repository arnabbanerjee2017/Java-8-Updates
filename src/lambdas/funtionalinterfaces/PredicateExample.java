package lambdas.funtionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @FunctionalInterface 
 * public class Predicate<T> {
 * 		boolean test(T t);
 * }
 * 
 * @author ARNAB
 *
 */

public class PredicateExample {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Kolkata");
		list.add("Chennai");
		list.add("Mumbai");
		list.add("New Delhi");
		list.add("Pune");
		list.add("Pune");
		list.add("New Delhi");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("New Delhi");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("New Delhi");
		list.add("Kolkata");
		
		String key = "Pune";
		
		list.forEach(value -> count(value, a -> a.equalsIgnoreCase(key)));
		
		System.out.println(count);
		
	}
	
	private static int count(String value, Predicate<String> predicate) {
		if(predicate.test(value)) {
			count++;
		}
		return count;
	}
}
