package WeekEight.ExerciseTwo.Model;

public class Cat extends Animal {
	public Cat () {}
	
	public Cat(String name, String race) {
		super(name, race);
	}
	
	// GETTERS
	public String Miar() {
		return "Miau...";
	}
	
	public String toString() {
		return "\nCat\n\n" + super.toString();
	}
	
}
