package com.banco;

import com.banco.cartoes.Cartao;
import com.banco.clientes.Cliente;
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
        for (int i = 0; i < clientesAgenciaPorto.size(); i++) {
            Cliente clt = clientesAgenciaPorto.get(i);
            System.out.println("Cliente num: " + clt.getNumCliente() + ", Nome: " + clt.getNome());
            System.out.println("Contas: ");
            for (int j = 0; j < clt.contas.size(); j++) {
               Conta cnta = clt.contas.get(j);
                System.out.println("Conta num "+cnta.getNumConta()+", Saldo: "
                    +cnta.getSaldo()+"€.");
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
//    public void listarClientesAgencia(List<Cliente> clientesAgencia) {
//        if (clientesAgencia == clientesAgenciaPorto) {
//            for (int i = 0; i < clientesAgencia.size(); i++) {
//                System.out.println("Clientes da Agencia do Porto:");
//                System.out.println("Cliente num " + clientesAgencia.get(i).getNumCliente() + ", Nome: " + clientesAgencia.get(i).getNome()
//                        + " Agencia num " + clientesAgencia.get(i).getNumAgencia() + ".");
//            }
//        } else {
//            for (int i = 0; i < clientesAgencia.size(); i++) {
//                System.out.println("Clientes da Agencia de Lisboa:");
//                System.out.println("Cliente num " + clientesAgencia.get(i).getNumCliente() + ", Nome: " + clientesAgencia.get(i).getNome()
//                        + " Agencia num " + clientesAgencia.get(i).getNumAgencia() + ".");
//            }
//        }
//    }
//    public ContaOrdem criaContaOrdem() {
//        return null;
//    }
//
//    public ContaPrazo criaContaPrazo() {
//        return null;
//    }
//
//    public ContaPoupanca criaPoupanca() {
//        return null;
//    }
//
//    public ContaInvestimento criaContaInvestimento() {
//        return null;
//    }
}
