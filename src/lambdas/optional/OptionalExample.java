package lambdas.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		print(getAverage(2, 3, 4, 5));
		print(getAverage());
		print(getAverage(10, 20, 30, 40, 50));
	}
	
	private static Optional<Double> getAverage(int... nums) {
		if(nums.length == 0) {
			return Optional.empty();
		} else {
			int sum = 0;
			for(int num: nums) {
				sum += num;
			}
			return Optional.of(Double.valueOf(((double) sum) / nums.length));
		}
	}
	
	private static void print(Optional<Double> value) {
		System.out.println(value.isPresent() ? (value.get().doubleValue() % (double)10 == (double) 0 ? value.get().intValue() : value.get()) : "Value not present");
	}
}
