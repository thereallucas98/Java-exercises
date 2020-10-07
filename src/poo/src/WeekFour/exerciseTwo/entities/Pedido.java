package WeekFour.exerciseTwo.entities;

public class Pedido {
	
	private float total;
	private ItemPedido item;
	
	public Pedido(ItemPedido item) {
		this.item = item;
	}
	
	// METHODS
	
	// GET
	public Float getTotal() {
		return this.total;
	}
	
	public ItemPedido getItem() {
		return this.item;
	}
		
	// SET
	public void addItem(int codigo, int quantidade, float valor, String descricao) {
		var produto = new Produto(codigo, (float) valor, descricao);
		this.item = new ItemPedido(quantidade, produto);
		
		total += valor * quantidade;
	}
		
	// TOSTRING

}
