package WeekEight.ExerciseFour.model;

public class Imovel {

	private String endere�o;
	private double pre�o;
	
	public Imovel() {}
	
	public Imovel(String endere�o, double pre�o) {
		
		this.endere�o = endere�o;
		this.pre�o = pre�o;
	}

	public String getEndere�o() {
		return this.endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public double getPre�o() {
		return this.pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public String toString() {
		return "\nEndere�o: " + this.endere�o + "\nPre�o: " + this.pre�o;
	}
	
	
}
