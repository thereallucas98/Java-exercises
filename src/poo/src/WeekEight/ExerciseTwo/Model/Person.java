package WeekEight.ExerciseTwo.Model;

public class Person {

	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// GETTERS
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// SETTERS
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	
	// TO STRING()
	public String toString() {
		return String.format("\nNAME: %s - AGE: %d", this.name, this.age);
	}
}
