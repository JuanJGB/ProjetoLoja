/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

/**
 *
 * @author juan.159417
 */
public class Produto {
    private int id;
    private String nome,descricao;
    private char Status;
    private float valor;

    public Produto(int id, String nome, String descricao, char Status, float valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.Status = Status;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getStatus() {
        return Status;
    }

    public void setStatus(char Status) {
        this.Status = Status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
