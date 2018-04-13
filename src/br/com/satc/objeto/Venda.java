/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;

/**
 *
 * @author juan.159417
 */
public class Venda {
    private int id;
    private Cliente Cliente;
    private ArrayList<Produto> produto = new ArrayList<>();
    private float totalAPagar;
    private char status;

    public Venda(int id, Cliente Cliente, float totalAPagar, char status) {
        this.id = id;
        this.Cliente = Cliente;
        this.totalAPagar = totalAPagar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(float totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
}
