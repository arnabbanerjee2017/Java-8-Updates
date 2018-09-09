package arnab.lambdas.unit3;

import java.util.stream.Stream;

public class StreamsExample3 {
	public static void main(String[] args) {
		Stream<Double> random = Stream.generate(Math::random);
		random.forEach(System.out::println);
		
	}
}
