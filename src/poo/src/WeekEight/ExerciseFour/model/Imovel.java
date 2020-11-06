package WeekEight.ExerciseFour.model;

public class Imovel {

	private String endereço;
	private double preço;
	
	public Imovel() {}
	
	public Imovel(String endereço, double preço) {
		
		this.endereço = endereço;
		this.preço = preço;
	}

	public String getEndereço() {
		return this.endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getPreço() {
		return this.preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String toString() {
		return "\nEndereço: " + this.endereço + "\nPreço: " + this.preço;
	}
	
	
}
