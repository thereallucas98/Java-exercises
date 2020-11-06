package WeekEight.ExerciseFour.model;

public class Novo extends Imovel {
	
	private double adicional, temp;
	
	public Novo() {}
	
	public Novo(String endereço, double preço) {
		super(endereço, preço);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void addAdicional() {
		temp = this.getPreço() + this.adicional;
		this.setPreço(temp);
	}
	
	public String toString() {
		return "\n::Imóvel novo::" + super.toString();
	}
}