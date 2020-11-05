package WeekEight.ExerciseOne.model;

public class Assistent extends Employee {
	private String iD;
	
	public Assistent() {}
	
	public Assistent(String name, String office, int age, float salary, String iD) {
		super(name, office, age, salary);
		this.iD = iD;
	}
	
	// GETTERS
	public String getId() {
		return this.iD;
	}
	
	
	// SETTERS
	public void setId(String newId) {
		this.iD = newId;
	}
	
	// TOSTRING()
	
	@Override
	public String toString() {
		return String.format("DADOS DO(A) FUNCIONÁRIO(A): "
				+ "\nNOME: %s - IDADE: %d\nFUNÇÃO: %s - SALÁRIO: %.2f\n"
				+ "MATRICULA: %s\n", getName(), getAge(), getOffice(), getSalary(), this.iD);
	}
}
