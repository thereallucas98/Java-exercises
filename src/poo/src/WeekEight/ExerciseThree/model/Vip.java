package WeekEight.ExerciseThree.model;

public class Vip extends Ingresso {
	
	private double valoradicional, temp;
	
	public Vip() {}
	
	public Vip(double valorReais, double valoradicional) {
		super(valorReais);
		this.valoradicional = valoradicional;
	}

	public double getValoradicional() {
		return this.valoradicional;
	}

	public void setValoradicional(double valoradicional) {
		this.valoradicional = valoradicional;
	}
	
	public String valorVip() {
		temp = this.getValorReais() + this.valoradicional;
		return "\\nVALOR DO INGRESSO VIP = " + this.temp;
	}

	public String toString() {
		return super.toString() + valorVip();
	}
	

}
