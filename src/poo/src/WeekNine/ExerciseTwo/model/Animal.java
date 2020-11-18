package WeekNine.ExerciseTwo.model;

public class Animal {
	private double weight;
	
	public Animal(double weight) {
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
	
	
	public void eat(Food food) {
		this.weight += food.getWeight();
	}
}
