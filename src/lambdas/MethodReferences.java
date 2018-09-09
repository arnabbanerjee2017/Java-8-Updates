package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Name2 {
	private String firstName;
	private String lastName;
	
	public Name2(String firstName, String lastName) {
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

public class MethodReferences {
	
	public static int compareByFirstName(Name2 a, Name2 b) {
		return a.getFirstName().compareTo(b.getFirstName());
	}
	
	public int compareByLastNameNegatively(Name2 a, Name2 b) {
		return -a.getLastName().compareTo(b.getLastName());
	}
	
	public static void main(String[] args) {
		List<Name2> list = new ArrayList<Name2>();
		list.add(new Name2("ARNAB", "BANERJEE"));
		list.add(new Name2("MANISHA", "BANERJEE"));
		list.add(new Name2("ASHOK", "BANERJEE"));
		list.add(new Name2("BAISALI", "ROY"));
		list.add(new Name2("TANIMA", "MUKHERJEE"));
		list.add(new Name2("SOHINI", "PAL"));
		
		MethodReferences ref = new MethodReferences();
		
		Comparator<Name2> comp1 = MethodReferences::compareByFirstName;
		Comparator<Name2> comp2 = ref::compareByLastNameNegatively;
		
		System.out.println(list);
		
		Collections.sort(list, comp1);
		System.out.println(list);
		
		Collections.sort(list, comp2);
		System.out.println(list);
		
	}

}
