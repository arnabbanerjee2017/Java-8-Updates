package arnab.lambdas.unit3;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("John Cena");
		list.add("The Rock");
		list.add("Consider a name!");
		
		list.forEach(a -> System.out.println(a.toUpperCase()));  // Using Lambda expression
		System.out.println();
		list.forEach(System.out::println);  // Using Method reference
	}
}
