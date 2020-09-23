package listaRevisao;

public class ExerciseThreeTruck {
	private boolean status = false;
	private double fuel = 0;
	private int speed = 0;

	// CONSTRUTOR

	public ExerciseThreeTruck(boolean status, double fuel, int speed) {
		this.status = status;
		this.fuel = fuel;
		this.speed = speed;
	}

	// METHODS

	// GET
	public boolean getStatus() {
		return this.status;
	}

	public double getFuel() {
		return this.fuel;
	}

	public int getSpeed() {
		return this.speed;
	}

	// SET
	public void setStatus() {
		if (this.status == false)
			this.status = true;
		else
			this.status = false;
	}

	public void setSpeed(int amount) {
		this.speed += amount;
	}
	
	public void setBreak (int amount) {
		this.speed -= amount;
	}
	
	public void setConsume (double amount) {
		this.fuel -= amount;
	}
	
	public void setFuel() {
		double toBeAdd = 60 - this.fuel;
		this.fuel += toBeAdd;
	}
	
	// RETURN
	
	public String toString() {
		return String.format("Velocidade Atual: %dkm/h\nCombustível: %.2fL", this.speed, this.fuel);
	}

}
