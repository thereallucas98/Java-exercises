/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Pedido {

    private float total;
    private List<ItemPedido> itens = new ArrayList();

    // METHODS
    // GET
    public Float getTotal() {
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.produto().getValor();
        }

        return total;
    }
    
    public String getAllItens() {
        String retorno = "";
        for (ItemPedido item : itens) {
            String valueToString = item.produto().getValor().toString();
           // String quantityToString = item.getQuantidade().toString();
            retorno += String.format("Produto: %s - Quantidade: %d - Valor: %s\n", 
                    item.produto().getDescricao(), item.getQuantidade(), 
                    valueToString);
        }
        return retorno;       
    }

    // SET
    public void addItem(int codigo, int quantidade, float valor, String descricao) {
        var produto = new Produto(codigo, (float) valor, descricao);
        this.itens.add(new ItemPedido(quantidade, produto));

    }

    // TOSTRING
}
