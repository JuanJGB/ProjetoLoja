/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.Date;

/**
 *
 * @author juan.159417
 */
public class Cliente extends Pessoa{
   private int id,idade;
   private char status;
   private Date dataCadastro;

    public Cliente(int id, int idade, char status, Date dataCadastro, String nome, String cpf, String rg, Date dataNascimento) {
        super(nome, cpf, rg, dataNascimento);
        this.id = id;
        this.idade = idade;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
   
   
    
}
