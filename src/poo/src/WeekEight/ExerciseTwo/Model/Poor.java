package WeekEight.ExerciseTwo.Model;

public class Poor extends Person {

	public Poor() {}
	
	public Poor(String name, int age) {
		super(name, age);
	}
	
	public String working() {
		return "Trabalhando";
	}
}
