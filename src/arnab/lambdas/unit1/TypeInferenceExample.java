package arnab.lambdas.unit1;

interface StringLength {
	int getStringLength(String s);
}

public class TypeInferenceExample {
	public static void main(String [] args) {
		StringLength stringLength = s -> s.length();
		System.out.println(stringLength.getStringLength("Hello World!"));
		
		StringLength stringLength2 = getStringLength();
		System.out.println(stringLength2.getStringLength("Hello World Again!"));
	}
	
	private static StringLength getStringLength() {
		return a -> a.length();
	}
	
}
