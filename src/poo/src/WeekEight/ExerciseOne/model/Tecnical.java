package WeekEight.ExerciseOne.model;

public class Tecnical extends Assistent {
	private double bonus;
	
	public Tecnical() {}
	
	public Tecnical(String name, String office, int age, float salary, String iD, double bonus) {
		super(name, office, age, salary, iD);
		
		this.bonus = bonus;
	}
	
	// GETTERS
	public Double getBonus() {
		return this.bonus;
	}
	
	// SETTERS
	public void setBonus(double newBonus) {
		this.bonus = newBonus;
	}
	
	
	// TO STRING()
	@Override
	public String toString() {
		return String.format("DADOS DO(A) FUNCION�RIO(A): "
				+ "\nNOME: %s - IDADE: %d\nFUN��O: %s - SAL�RIO: %.2f\n"
				+ "MATRICULA: %s\n", getName(), getAge(), getOffice(), getSalary(), getId());
	}
}
