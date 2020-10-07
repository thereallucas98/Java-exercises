package WeekFour.exerciseTwo.entities;

public class Produto {

	private int codigo;
	private float valor;
	private String descricao;
	
	// CONSTRUCTOR 
	public Produto(int codigo, float valor, String descricao) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	// METHODS
	
	// GET
	public int getCodigo() {
		return this.codigo;
	}
	
	public Float getValor() {
		return this.valor;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	// SET
	public void setCodigo(int newCodigo) {
		this.codigo = newCodigo;
	}
	
	public void setValor(Float newValor) {
		this.valor = newValor;
	}
	
	public void setDescricao(String newDescricao) {
		this.descricao = newDescricao;
	}
	
	// TOSTRING
	public String toString() {
		return String.format("\n\nPRODUTO: %d - "
				+ "VALOR: %.2f\nDESCRIÇÃO: %s", this.codigo, this.valor, this.descricao);
	}
	
	
}
