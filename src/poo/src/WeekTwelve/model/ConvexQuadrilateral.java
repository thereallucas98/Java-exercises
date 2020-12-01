package WeekTwelve.model;

public class ConvexQuadrilateral extends Quadrilateral {
	
	public ConvexQuadrilateral(float sideUp, float sideDown, float sideLeft, float sideRight) {
		super(sideUp, sideDown, sideLeft, sideRight);
	}

	@Override
	public float perimeterMath() {
		return ((sideUp * sideLeft) + (sideLeft * sideDown) + 
				(sideDown * sideRight) + (sideRight + sideUp));
	}
	
	public float getPerimeter() {
		return perimeterMath();
	}

	@Override
	public float areaMath() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public float getArea() {
		return areaMath();
	}
	
	@Override
	public String toString() {
		return String.format("\nÁREA: %.2f\nPerímetro: %.2f", getArea(), getPerimeter());
	}
	
}
