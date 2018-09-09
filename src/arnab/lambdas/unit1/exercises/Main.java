package arnab.lambdas.unit1.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
					new Person("Arnab", "Banerjee", 28),
					new Person("Manisha", "Banerjee", 53),
					new Person("Ashok", "Banerjee", 58),
					new Person("Sohini", "Pal", 28),
					new Person("Baisali", "Roy", 25),
					new Person("Tanima", "Mukherjee", 26)
				);
		
		// Print the list as it is.
		System.out.println(people);
		
		// Step 1: Sort list by last name.
		Collections.sort(people, (a, b) -> a.getLastName().compareTo(b.getLastName()));
		System.out.println(people);
		System.out.println();
		
		// Step 2: Create a method that prints all elements in the list.
		people.forEach(a -> System.out.println("First Name:" + a.getFirstName() + " Last Name: " + a.getLastName() + " Age: " + a.getAge()));
		System.out.println();
		
		// Step 3: Create e method that prints all people that have last name beginning with B.
		people.forEach(a -> {if(a.getLastName().toUpperCase().startsWith("B")) System.out.println("First Name:" + a.getFirstName() + " Last Name: " + a.getLastName() + " Age: " + a.getAge());});
		System.out.println();
		printLastNameWithB(people);
		System.out.println();
		printLastNameWithB(people, a -> a.getLastName().toUpperCase().startsWith("B"));
		System.out.println();
		
		// Using Consumer<T> interface
		printLastNameWithB(people, a -> a.getLastName().toUpperCase().startsWith("B"), a -> System.out.println("First Name:" + a.getFirstName() + " Last Name: " + a.getLastName() + " Age: " + a.getAge()));
	}
	
	private static void printLastNameWithB(List<Person> list) {
		list.forEach(a -> {if(a.getLastName().toUpperCase().startsWith("B")) System.out.println("First Name:" + a.getFirstName() + " Last Name: " + a.getLastName() + " Age: " + a.getAge());});
	}
	
	private static void printLastNameWithB(List<Person> list, Predicate<Person> predicate) {
		for(Person person: list) {
			if(predicate.test(person)) {
				System.out.println("First Name:" + person.getFirstName() + " Last Name: " + person.getLastName() + " Age: " + person.getAge());
			}
		}
	}
	
	private static void printLastNameWithB(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person: list) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
