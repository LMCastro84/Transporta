package com.banco;

import com.banco.cartoes.Cartao;
import com.banco.clientes.Cliente;
import com.banco.clientes.ClienteNormal;
import com.banco.contas.Conta;
import com.banco.contas.ContaInvestimento;
import com.banco.contas.ContaOrdem;
import com.banco.contas.ContaPoupanca;
import com.banco.contas.ContaPrazo;
import com.banco.output.Menu;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    String nomeBanco = "BANCO JAVA";
    private int numAgencia;
    private String moradaAgencia;
    public List<Cliente> clientesAgenciaPorto = new ArrayList<Cliente>();
    public List<Cliente> clientesAgenciaLisboa = new ArrayList<Cliente>();
    public List<Cliente> clientesGeral = new ArrayList<Cliente>();
    public List<Conta> contas = new ArrayList<Conta>();
    public List<Cartao> cartoes = new ArrayList<>();

    Menu menu = new Menu();

    public Banco() {
    }

    public Banco(int numAgencia, String moradaAgencia, List<Cliente> clientesGeral) {
        this.numAgencia = numAgencia;
        this.moradaAgencia = moradaAgencia;
        this.clientesGeral = clientesGeral;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public void setMoradaAgencia(String moradaAgencia) {
        this.moradaAgencia = moradaAgencia;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public String getMoradaAgencia() {
        return moradaAgencia;
    }

    public Cliente getClienteById(int id) {
        Cliente cliente = null;
        for (int i = 0; i < clientesGeral.size(); i++) {
            if (id == clientesGeral.get(i).getNumCliente()) {
                cliente = clientesGeral.get(i);
            }
        }
        return cliente;
    }

    public void adicionarCliente(Cliente clt) {
        clientesGeral.add(clt);
        if (clt.getNumAgencia() == 1) {
            clientesAgenciaPorto.add(clt);
        } else {
            clientesAgenciaLisboa.add(clt);
        }
    }

    public void listarClientesPorto() {
        Cliente cltNormal = new ClienteNormal();
        for (int i = 0; i < clientesAgenciaPorto.size(); i++) {
            Cliente clt = clientesAgenciaPorto.get(i);
            boolean isEqual = clt.getClass().equals(cltNormal.getClass());
            if (isEqual) {
                System.out.println("Cliente num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            } else {
                System.out.println("Cliente VIP num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            }
            System.out.println("Contas: ");
            for (int j = 0; j < clt.contas.size(); j++) {
                Conta cnta = clt.contas.get(j);
                System.out.println("Conta num " + cnta.getNumConta() + ", Saldo: "
                        + cnta.getSaldo() + "€.");
            }
            System.out.println("- - -");
        }
    }

    public void listarClientesLisboa() {
        Cliente cltNormal = new ClienteNormal();
        for (int i = 0; i < clientesAgenciaLisboa.size(); i++) {
            Cliente clt = clientesAgenciaLisboa.get(i);
            boolean isEqual = clt.getClass().equals(cltNormal.getClass());
            if (isEqual) {
                System.out.println("Cliente num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            } else {
                System.out.println("Cliente VIP num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            }
            System.out.println("Contas: ");
            for (int j = 0; j < clt.contas.size(); j++) {
                Conta cnta = clt.contas.get(j);
                System.out.println("Conta num " + cnta.getNumConta() + ", Saldo: "
                        + cnta.getSaldo() + "€.");
            }
            System.out.println("- - -");
        }
    }

    public void listarClientesGeral() {
        Cliente cltNormal = new ClienteNormal();
        for (int i = 0; i< clientesGeral.size(); i++){
            Cliente clt = clientesGeral.get(i);
            boolean isEqual = clt.getClass().equals(cltNormal.getClass());
            if (isEqual) {
                System.out.println("Cliente num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            } else {
                System.out.println("Cliente VIP num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            }
            System.out.println("Contas: ");
            for (int j = 0; j < clt.contas.size(); j++) {
                Conta cnta = clt.contas.get(j);
                System.out.println("Conta num " + cnta.getNumConta() + ", Saldo: "
                        + cnta.getSaldo() + "€.");
            }
            System.out.println("- - -");
        }
    }

//public void eliminarCliente(int numCliente) {
//        for (int i = 0; i < clientesGeral.size(); i++) {
//            clientesGeral.get(i);
//            if (numCliente == clientesGeral.get(i).getNumAgencia()) {
//                clientesGeral.remove(i);
//            }
//        }
//    }
//    public void updateClienteString(int id) {
//        Cliente cliente = getClienteById(id);
//    }
//
}
