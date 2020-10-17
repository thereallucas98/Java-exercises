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
    // GETTERS
    public int getCodigo() {
        return this.codigo;
    }

    public Float getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // SETTERS
    public void setCodigo(int newCodigo) {
        this.codigo = newCodigo;
    }

    public void setValor(Float newValor) {
        this.valor = newValor;
    }

    public void setDescricao(String newDescricao) {
        this.descricao = newDescricao;
    }
    // RETURN

    public String toString() {
        return String.format("\n\nPRODUTO: %d - "
                + "VALOR: %.2f\nDESCRIÇÃO: %s", this.codigo, this.valor, this.descricao);
    }
}
