package WeekTwelve.model;

public class Square implements GeometricForm {

	private float side;
	
	
	public Square(float side) {
		this.side = side;
	}

	@Override
	public float perimeterMath() {
		return 4 * side;
	}
	
	public float getPerimeter() {
		return perimeterMath();
	}

	@Override
	public float areaMath() {
		// TODO Auto-generated method stub
		return side * side;
	}
	
	public float getArea() {
		return areaMath();
	}
	
	@Override
	public String toString() {
		return String.format("\nÁREA: %.2f\nPerímetro: %.2f", getArea(), getPerimeter());
	}
	
}
