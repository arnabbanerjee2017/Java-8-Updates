package methods.staticanddefault;

interface Animal2 {
	String getAnimal();
	static String getAnimalName() {
		return "Just an animal";
	}
}

class Tiger2 implements Animal2 {

	@Override
	public String getAnimal() {
		return "Royal Bengal Tiger";
	}
	
	
	public String getAnimalName2() {
		return Animal2.getAnimalName();
	}
	
}

public class StaticMethodInInterfaceExample {
	public static void main(String[] args) {
		Tiger2 animal = new Tiger2();
		System.out.println(animal.getAnimal());
		System.out.println(animal.getAnimalName2());
		
		System.out.println(Animal2.getAnimalName());
	}
}
