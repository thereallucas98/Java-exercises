package WeekEight.ExerciseTwo.Model;

public class Rich extends Person {
	private double cash;
	
	public Rich() {}
	
	public Rich(String name, int age, double cash) {
		super(name, age);
		this.cash = cash;
	}
	
	// GETTERS
	public Double getCash() {
		return this.cash;
	}
	
	// SETTERS
	public void setCach(Double newEntry) {
		this.cash += newEntry;
	}
	
	
	// OTHERS METHODS
	public void goShopping(Double out) {
		if (this.cash <= out) {
			this.cash = 0;
		} else {
			this.cash -= out;
		}
	}
	
}
