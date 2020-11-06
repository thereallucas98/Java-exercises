package WeekEight.ExerciseThree.model;

public class Ingresso {

	private double valorReais;
	
	public Ingresso() {}
	
	public Ingresso(double valorReais) {
		this.valorReais = valorReais;
	}
	
	public double getValorReais() {
		return this.valorReais;
	}

	public void setValorReais(double valorReais) {
		this.valorReais = valorReais;
	}

	public String imprimeValor() {
		return "Valor: " + this.valorReais;
	}

	public String toString() {
		return String.format("\nINGRESSO: %.2f", this.valorReais);
	}
	
	
}