/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas
 */
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
