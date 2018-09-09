package arnab.lambdas.unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}

public class StreamsExample1 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Arnab", "Banerjee", 28));
		list.add(new Person("Manisha", "Banerjee", 53));
		list.add(new Person("Ashok", "Banerjee", 58));
		list.add(new Person("Sohini", "Pal", 28));
		list.add(new Person("Baisali", "Roy", 25));
		list.add(new Person("Tanima", "Mukherjee", 26));
		
		list.stream()
		.filter(a -> a.getLastName().toUpperCase().startsWith("B"))
		.forEach(a -> System.out.println(a.getFirstName()));
		
		list.forEach(a -> printStringCount(a.getFirstName() + " " + a.getLastName(), b -> System.out.println(b.length())));
		
		list.stream()
		.map(a -> (a.getFirstName() + " " + a.getLastName()).length())
		.forEach(System.out::println);
		
	}
	
	private static void printStringCount(String value, Consumer<String> consumer) {
		consumer.accept(value);
	}
}
