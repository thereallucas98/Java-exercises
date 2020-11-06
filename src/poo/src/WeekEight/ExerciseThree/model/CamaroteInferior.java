package WeekEight.ExerciseThree.model;

public class CamaroteInferior extends Vip {
	
	private String localiza�aoIn;
	
	public CamaroteInferior() {}

	public CamaroteInferior(double valorReais, double valoradicional) {
		super(valorReais, valoradicional);
	}

	public String getLocaliza�aoIn() {
		return this.localiza�aoIn;
	}

	public void setLocaliza�aoIn(String localiza�aoIn) {
		this.localiza�aoIn = localiza�aoIn;
	}
	
	public String valorCS() {
		double value = this.getValorReais() * getValoradicional();
		return "\\nValor do Camarote Superior = " + value;
	}

	public String toString() {
		return super.toString() + "\nLocaliza�ao do Ingresso no Camarote Inferior: " + this.localiza�aoIn;
	}
	
}