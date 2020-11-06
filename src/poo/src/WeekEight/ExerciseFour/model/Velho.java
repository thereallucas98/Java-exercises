package WeekEight.ExerciseFour.model;

public class Velho extends Imovel {
	
	private double desconto, temp;
	
	public Velho() {}
	
	public Velho(String endereço, double preço) {
		super(endereço, preço);
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void addDesconto() {
		temp = this.getPreço() - this.desconto;
		this.setPreço(temp);
	}

	public String toString() {
		return "\n::Imóvel antigo::" + super.toString();
	}
	
}