package WeekNine.ExerciseTwo.model;

public abstract class Food {

private double weight;
	
	public Food(double weight) {
		setWeight(weight);
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double newWeight) {
		if(weight >= 0) {
			this.weight = newWeight;
		}
	}
}
