package WeekEight.ExerciseTwo.Model;

public class Dog extends Animal {

	public Dog() {}
	
	public Dog(String name, String race) {
		super(name, race);
	}
	
	public String Latir() {
		return "AU AU AU...";
	}
	
	public String toString() {
		return "\nDog\n\n" + super.toString();
	}
}
