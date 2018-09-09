package lambdas;

import java.util.function.Predicate;

class Animal2 {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal2(String species, boolean canHop, boolean canSwim) {
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

public class PredicateTest {
	private static void print(Animal2 animal, Predicate<Animal2> trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		} else {
			System.out.println("Don't get it!");
		}	
	}
	
	public static void main(String[] args) {
		print(new Animal2("FISH", false, true), (Animal2 a) -> { return a.isCanHop(); });
		print(new Animal2("Kangaroo", true, false), t -> t.isCanHop());
	}
}
