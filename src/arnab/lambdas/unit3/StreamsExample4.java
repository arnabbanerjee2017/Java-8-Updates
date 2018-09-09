package arnab.lambdas.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample4 {
	public static void main(String[] args) {
		List<String> one = Arrays.asList("one", "two", "three");
		List<String> two = Arrays.asList("four", "five", "six");
		List<String> three = Arrays.asList("seven", "eight", "nine");
		
		Stream<List<String>> stream = Stream.of(one, two, three);
		stream.flatMap(a -> a.stream()).forEach(System.out::println);
		
	}
}
