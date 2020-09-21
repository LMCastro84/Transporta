package com.banco;

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

    private int numAgencia;
    private String moradaAgencia;
    public List<Cliente> clientesPorto = new ArrayList<Cliente>();
    public List<Cliente> clientesLisboa = new ArrayList<Cliente>();
    public List<Cliente> clientesGeral = new ArrayList<Cliente>();
    public List<Conta> contas = new ArrayList<Conta>();

    Menu menu = new Menu();

    public Banco() {
    }

    public Banco(int numAgencia, String moradaAgencia, List<Cliente> clientesGeral) {
        this.numAgencia = numAgencia;
        this.moradaAgencia = moradaAgencia;
        this.clientesGeral = clientesGeral;
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

    public void adicionarCliente(Cliente cliente) {
        clientesGeral.add(cliente);
        alocarClienteGeralAgencia(cliente);
    }

    public void alocarClienteGeralAgencia(Cliente cliente) {
        if (cliente.getNumAgencia() == 1) {
            clientesPorto.add(cliente);
        } else {
            clientesLisboa.add(cliente);
        }
    }

    public void eliminarCliente(int numCliente) {
        for (int i = 0; i < clientesGeral.size(); i++) {
            clientesGeral.get(i);
            if (numCliente == clientesGeral.get(i).getNumAgencia()) {
                clientesGeral.remove(i);
            }
        }
    }

    public void updateClienteString(int id) {
        Cliente cliente = getClienteById(id);
    }

    public void listarClientesGeral() {
        if (clientesGeral.size() >= 1) {
            for (int i = 0; i < clientesGeral.size(); i++) {
                System.out.println("Cliente num " + clientesGeral.get(i).getNumCliente() + ", Nome: " + clientesGeral.get(i).getNome() + ".");
            }
        } else {
            System.out.println("De momento não existe nenhum cliente registado!");
        }
    }

    public void listarClientesAgencia(List<Cliente> clientesAgencia) {
        if (clientesAgencia == clientesPorto) {
            for (int i = 0; i < clientesAgencia.size(); i++) {
                System.out.println("Clientes da Agencia do Porto:");
                System.out.println("Cliente num " + clientesAgencia.get(i).getNumCliente() + ", Nome: " + clientesAgencia.get(i).getNome()
                        + " Agencia num " + clientesAgencia.get(i).getNumAgencia() + ".");
            }
        } else {
            for (int i = 0; i < clientesAgencia.size(); i++) {
                System.out.println("Clientes da Agencia de Lisboa:");
                System.out.println("Cliente num " + clientesAgencia.get(i).getNumCliente() + ", Nome: " + clientesAgencia.get(i).getNome()
                        + " Agencia num " + clientesAgencia.get(i).getNumAgencia() + ".");
            }
        }
    }

    public ContaOrdem criaContaOrdem() {
        return null;
    }

    public ContaPrazo criaContaPrazo() {
        return null;
    }

    public ContaPoupanca criaPoupanca() {
        return null;
    }

    public ContaInvestimento criaContaInvestimento() {
        return null;
    }

}
