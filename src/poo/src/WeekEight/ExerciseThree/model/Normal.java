package WeekEight.ExerciseThree.model;

public class Normal extends Ingresso {

	public Normal() {}
	
	public Normal (double valorReais) {
		super(valorReais);
	}
	
	public String normal() {
		return "Este é um ingresso normal!";
	}
	
	public String toString() {
		return super.toString() + normal();
	}
}
