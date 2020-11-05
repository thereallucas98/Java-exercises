package WeekEight.ExerciseOne.model;

public class Manager extends Employee {
	private String sector;
	
	public Manager() {}
	
	public Manager(String name, String office, int age, float salary, String sector) {
		super(name, office, age, salary);
		
		this.sector = sector;
	}
	
	// GETTERS
	public String getSector() {
		return this.sector;
	}
	
	// SETTERS
	public void setSector(String newSector) {
		this.sector = newSector;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return String.format("DADOS DO(A) FUNCIONÁRIO(A): "
				+ "\nNOME: %s - IDADE: %d\nFUNÇÃO: %s - SALÁRIO: %.2f\n"
				+ "SETOR: %s\n", getName(), getAge(), getOffice(), getSalary(), this.sector);
	}
	
}
