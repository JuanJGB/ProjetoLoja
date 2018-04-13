/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.enumerador.Menu;
import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Produto;
import br.com.satc.objeto.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.159417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        List<Cliente> Cliente = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int id;
        char status;
        int opcaoEscolhida = 0;

        String opcoesMenu = "";
        for (Menu menu : Menu.values()) {
            opcoesMenu += menu.getNumeroMenu() + " " + menu.getNome() + "\n ";
        }
        do {

            opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n " + opcoesMenu));

            for (Menu menu : Menu.values()) {

                if ((opcaoEscolhida) == (menu.getNumeroMenu())) {

                    switch (opcaoEscolhida) {

                        case 1:
                            do {

                                String nome, descricao;
                                float valor;

                                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do produto: "));
                                nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
                                descricao = JOptionPane.showInputDialog("Informe a descrição: ");
                                valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto: "));
                                status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo: ").toUpperCase().charAt(0);

                                if ((status != 'A') && (status != 'I')) {
                                    JOptionPane.showMessageDialog(null, "INVÁLIDO!");
                                } else {
                                    produtos.add(new Produto(id, nome, descricao, status, valor));
                                }
                            } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

                            break;
                        case 2:
                            do {

                                Date dataCadastro;
                                int idade;

                                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do Cliente: "));
                                dataCadastro = sdf.parse(JOptionPane.showInputDialog("Informe a data de Cadastro:"));
                                status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo: ").toUpperCase().charAt(0);
                                idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente: "));
                                if ((status != 'A') && (status != 'I')) {
                                    JOptionPane.showMessageDialog(null, "INVÁLIDO!");
                                } else {
                                    Cliente.add(new Cliente(id, idade, status, dataCadastro, opcoesMenu, opcoesMenu, opcoesMenu, dataCadastro));
                                }

                            } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

                            break;
                        case 3:
                            do {
                                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id da Venda: "));
                                status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo: ").toUpperCase().charAt(0);
                                String opcoesClientes = "";
                                for (Cliente cl : Cliente) {
                                    opcoesClientes += "\n" + Cliente.indexOf(Cliente) + " " + cl.getNome();
                                    int escolhaCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o Cliente: \n " + opcoesClientes));
                                    if (escolhaCliente != Cliente.indexOf(cl)) {
                                        JOptionPane.showMessageDialog(null, "INVÁLIDO");
                                    } else if ((status != 'A') && (status != 'I')) {
                                        JOptionPane.showMessageDialog(null, "INVÁLIDO!");
                                    } else {
                                        vendas.add(new Venda(id, (Cliente) Cliente, status, status));
                                    }
                                }
                            }while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

                                break;
                              case 4:

                            break;
                        case 5:

                            break;
                        case 6:

                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "Até mais!!");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "INVALIDO");
                            break;
                    }

                
                    }
                }

            }
            while (opcaoEscolhida != 7);

        }


    }
