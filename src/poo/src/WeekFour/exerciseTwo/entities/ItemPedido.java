package WeekFour.exerciseTwo.entities;

public class ItemPedido {
	private int quantidade;
	private Produto produto;
	
	public ItemPedido(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	// METHODS
	
	// GET
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public Produto produto() {
		return this.produto;
	}
		
	// SET
	public void setQuantidade(int newQuantidade) {
		this.quantidade = newQuantidade;
	}
	
	public void setProduto(Produto newProduto) {
		this.produto = newProduto;
	}
		
	// TOSTRING
	public String toString() {
		return String.format("\nQUANTIDADE: %d\n\nPEDIDOS: \n%s", this.quantidade, this.produto);
	}
}
