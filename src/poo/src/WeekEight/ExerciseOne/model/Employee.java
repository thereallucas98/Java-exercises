package WeekEight.ExerciseOne.model;

public class Employee {

	private String name;
	private String office;
	private int age;
	private float salary;
	
	public Employee() {};
	
	public Employee(String name, String office, int age, float salary) {
		this.name = name;
		this.office = office;
		this.age = age;
		this.salary = salary;
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
	
	// TOSTRING
	
	public String toString() {
		return String.format("DADOS DO(A) FUNCION�RIO(A): "
				+ "\nNOME: %s - IDADE: %d\nFUN��O: %s - SAL�RIO: %.2f\n", this.name, this.age, this.office, this.salary);
	}

}
