package WeekNine.ExerciseOne.model;

public class Employee {

	private String name;
	private String office;
	private int age;
	private float salary;
	private float journey;
	
	public Employee() {};
	
	public Employee(String name, String office, int age, float salary, float journey) {
		this.name = name;
		this.office = office;
		this.age = age;
		this.salary = salary;
		this.journey = journey;
	}
	
	// GETTERS
	public String getName() {
		return this.name;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	// SETTERS
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setOffice(String newOffice) {
		this.office = newOffice;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setSalary(float newSalary) {
		this.salary = newSalary;
	}
	
	// METHODS
	
	public void working(Journey journey) {
		if (this.journey <= this.salary) {
			this.journey += journey.getResult();
		}
	}
	
	// TOSTRING
	
	public String toString() {
		return String.format("DADOS DO(A) FUNCIONÁRIO(A): "
				+ "\nNOME: %s - IDADE: %d\nFUNÇÃO: %s - SALÁRIO: %.2f"
				+ "\n\nJORNADA: %.2f", this.name, this.age, this.office, this.salary, this.journey);
	}

}