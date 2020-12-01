package WeekTwelve.model;

public class Rectangle implements GeometricForm {
	
	private float base;
	private float height;
	
	public Rectangle(float base, float height) {
		this.base = base;
		this.height = height;
	}

	public Rectangle () {} 
		
	
	@Override
	public float perimeterMath() {
		return 2 * (base + height);
	}

	public float getPerimeter() {
		return perimeterMath();
	}
	
	@Override
	public float areaMath() {
		return base * height;
	}
	
	public float getArea() {
		return areaMath();
	}
	
	@Override
	public String toString() {
		return String.format("\n�REA: %.2f\nPer�metro: %.2f", getArea(), getPerimeter());
	}
	
}
