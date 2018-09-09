package methods.staticanddefault;

interface Animal {
	String getAnimal();
	default String getAnimalName() {
		return "Tiger";
	}
}

class Tiger implements Animal {

	@Override
	public String getAnimal() {
		return "Royal Bengal Tiger";
	}
	
}

class Cat implements Animal {

	@Override
	public String getAnimal() {
		return "House Cat";
	}
	
	@Override
	public String getAnimalName() {
		return "Cat";
	}
	
}

public class DefaultMethodExample {
	public static void main(String[] args) {
		Animal animal = new Tiger();
		System.out.println(animal.getAnimal());
		System.out.println(animal.getAnimalName());
		
		animal = new Cat();
		System.out.println(animal.getAnimal());
		System.out.println(animal.getAnimalName());
	}
}
