package WeekTwelve.model;

public abstract class Quadrilateral implements GeometricForm {
	protected float sideUp; // A  
	protected float sideDown; // C 
	protected float sideLeft; // B
	protected float sideRight; // D 
	
	public Quadrilateral(float sideUp, float sideDown, float sideLeft, float sideRight) {
		this.sideUp = sideUp;
		this.sideDown = sideDown;
		this.sideLeft = sideLeft;
		this.sideRight = sideRight;
	}
	
	public Quadrilateral() {}
	
	// METHODS

	public float getSideUp() {
		return sideUp;
	}

	public void setSideUp(float sideUp) {
		this.sideUp = sideUp;
	}

	public float getSideDown() {
		return sideDown;
	}

	public void setSideDown(float sideDown) {
		this.sideDown = sideDown;
	}

	public float getSideLeft() {
		return sideLeft;
	}

	public void setSideLeft(float sideLeft) {
		this.sideLeft = sideLeft;
	}

	public float getSideRight() {
		return sideRight;
	}

	public void setSideRight(float sideRight) {
		this.sideRight = sideRight;
	}
	
	// INHERITED METHODS BY INTERFACE
	
	public float perimeter() {
		return ((sideUp * sideLeft) + (sideLeft * sideDown) + 
				(sideDown * sideRight) + (sideRight + sideUp));
	}
	
}
