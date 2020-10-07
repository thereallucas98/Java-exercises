package WeekFour.exerciseOne.entities;

public class Employe {
	
	private String name;
	private String number;
	private int age;

	// CONSTRUCTOR
	public Employe(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	// METHODS
		
	// GET
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public int getAge() {
		return this.age;
	}
		
	// SET
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setNumber(String newNumber) {
		this.number = newNumber;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	// TO STRING
	public String toString() {
		return String.format("\nNOME: %s - IDADE: %d - NÚMERO DE CONTATO: %s", this.name, this.age, this.number);
	}
}
