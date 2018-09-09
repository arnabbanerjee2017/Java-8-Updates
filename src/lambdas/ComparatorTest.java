package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Name {
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public String toString() {
		return this.getFirstName() + " " + this.getLastName();
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator<Name> comp1 = new Comparator<Name> () {
			@Override
			public int compare(Name o1, Name o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}			
		};
		
		Comparator<Name> comp2 = (n1, n2) -> -n1.getLastName().compareTo(n2.getLastName());
		
		List<Name> list = new ArrayList<>();
		list.add(new Name("ARNAB", "BANERJEE"));
		list.add(new Name("MANISHA", "BANERJEE"));
		list.add(new Name("ASHOK", "BANERJEE"));
		list.add(new Name("SOHINI", "PAL"));
		
		System.out.println(list);
		
		Collections.sort(list, comp1);
		
		System.out.println(list);
		
		Collections.sort(list, comp2);
		
		System.out.println(list);
		
		
	}
}
