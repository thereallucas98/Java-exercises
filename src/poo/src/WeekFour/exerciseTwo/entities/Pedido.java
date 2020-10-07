package WeekFour.exerciseTwo.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private float total;
	private List<ItemPedido> itens = new ArrayList();
	
	
	// METHODS
	
	// GET
	public Float getTotal() {
		for (ItemPedido item: itens) {
			total += item.getQuantidade() * item.produto().getValor();
		}
		
		return total;
	}
		
	// SET
	public void addItem(int codigo, int quantidade, float valor, String descricao) {
		var produto = new Produto(codigo, (float) valor, descricao);
		this.itens.add(new ItemPedido(quantidade, produto));
		
	}
		
	// TOSTRING

}
