/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.enumerador;

/**
 *
 * @author juan.159417
 */
public enum Menu {
    CADASTRARPRODUTO(1, "Cadastrar Produto"),
    CADASTRARCLIENTE(2, "Cadastrar Cliente"),
    CADASTRARVENDA(3, "Cadastrar Venda"),
    CONSULTARPRODUTO(4, "Consultar Produto"),
    CONSULTARCLIENTE(5,"Consultar Cliente"),
    CONSULTARVENDA(6,"Consultar Venda"),
    SAIR(7, "Sair");

    private int numeroMenu;
    private String nome;

    public int getNumeroMenu() {
        return numeroMenu;
    }

    public String getNome() {
        return nome;
    }

    private Menu(int numeroMenu, String nome) {
        this.numeroMenu = numeroMenu;
        this.nome = nome;
    }

}
