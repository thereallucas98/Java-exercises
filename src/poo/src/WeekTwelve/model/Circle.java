package WeekTwelve.model;

public class Circle implements GeometricForm {

	private float radius;
	final float PI = 3.1416F;	
	
	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public float perimeterMath() {
		// TODO Auto-generated method stub
		return 2 * radius * PI;
	}

	@Override
	public float areaMath() {
		// TODO Auto-generated method stub
		return (float) (PI * (Math.pow(2, radius)));
	}
}
