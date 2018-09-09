package lambdas;

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}
	
	public String toString() {
		return this.getSpecies();
	}
}

@FunctionalInterface
interface CheckTrait {
	boolean test(Animal animal);
}

@FunctionalInterface
interface DynamicAddition {
	int add(int x, int y);
}

@FunctionalInterface
interface StaticAddition {
	int add();
}

public class FunctionalInterfaceTest {
	private static void print(Animal animal, CheckTrait trait)  {
		if(trait.test(animal)) {
			System.out.println(animal);
		} else {
			System.out.println("Don't Know!");
		}
	}
	
	public static void main(String[] args) {
		print(new Animal("FISH", false, true), (Animal a) -> { return a.isCanHop(); });
		print(new Animal("Kangaroo", true, false), t -> t.isCanHop());
		
		DynamicAddition d = (int a, int b) -> { return a + b; };
		System.out.println(d);
		
	}
}
