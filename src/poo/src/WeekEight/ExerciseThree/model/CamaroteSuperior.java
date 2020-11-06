package WeekEight.ExerciseThree.model;

public class CamaroteSuperior extends Vip {

	private double valoradicional, temp;
	
	public CamaroteSuperior() {}

	public CamaroteSuperior(double valorReais, double valoradicional) {
		super(valorReais, valoradicional);
	}
	
	public String valorCS() {
		temp = this.getValorReais() * this.valoradicional;
		return "\\nValor do Camarote Superior = " + this.temp;
	}

	public String toString() {
		return super.toString() + this.valorCS();
	}
}
