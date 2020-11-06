package WeekEight.ExerciseThree.model;

public class CamaroteInferior extends Vip {
	
	private String localizaçaoIn;
	
	public CamaroteInferior() {}

	public CamaroteInferior(double valorReais, double valoradicional) {
		super(valorReais, valoradicional);
	}

	public String getLocalizaçaoIn() {
		return this.localizaçaoIn;
	}

	public void setLocalizaçaoIn(String localizaçaoIn) {
		this.localizaçaoIn = localizaçaoIn;
	}
	
	public String valorCS() {
		double value = this.getValorReais() * getValoradicional();
		return "\\nValor do Camarote Superior = " + value;
	}

	public String toString() {
		return super.toString() + "\nLocalizaçao do Ingresso no Camarote Inferior: " + this.localizaçaoIn;
	}
	
}