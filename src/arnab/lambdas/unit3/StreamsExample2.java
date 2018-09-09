package arnab.lambdas.unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamsExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10000000; i++) {
			list.add(i * 2);
		}		
		
		list.forEach(a -> printStringCount(a, b -> System.out.println(b)));
		
	}
	
	private static void printStringCount(Integer value, Consumer<Integer> consumer) {
		consumer.accept(value);
	}
}
