package WeekEight.ExerciseTwo.Model;

public class Animal {

	private String name;
	private String race;
	
	public Animal() {}
	
	public Animal(String name, String race) {
		this.name = name;
		this.race = race;
	}
	
	// GETTERS
	public String getName() {
		return this.name;
	}
	
	public String getRace() {
		return this.race;
	}
	
	// SETTERS
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setRace(String newRace) {
		this.race = newRace;
	}
	
	// OTHERS METHODS
	public String caminha() {
		return "Caminhando...";
	}
	
	
	// TOSTRING()
	public String toString() {
		return String.format("\nMY PET\nNOME: %s - RAÇA: %s", this.name, this.race);
	}
}
