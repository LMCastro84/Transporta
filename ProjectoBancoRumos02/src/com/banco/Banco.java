package com.banco;

import com.banco.clientes.Cliente;
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
    public List<Cliente> clientes = new ArrayList<>();
    public List<Cliente> clientesPorto = new ArrayList<>();
    public List<Cliente> clientesLisboa = new ArrayList<>();

    Menu menu = new Menu();

    public Banco() {
    }

    public Banco(int numAgencia, String moradaAgencia, List<Cliente> clientes) {
        this.numAgencia = numAgencia;
        this.moradaAgencia = moradaAgencia;
        this.clientes = clientes;
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
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getNumCliente()) {
                cliente = clientes.get(i);
            }
        }
        return cliente;
    }

    public String getSaldoByIdString(int id) {
        return "Saldo do cliente numero : " + id + ": " + getSaldoById(id) + " Euros.";
    }

    public double getSaldoById(int id) {
        double saldoCliente = 0;
        return saldoCliente;
    }

    public String levantaSaldoClienteString(int id, double levantamento) {
        subtraiSaldoCliente(id, levantamento);
        return "Foram levantados " + levantamento + " Euros da conta do cliente numero "
                + getClienteById(id).getNumCliente() + ". Novo saldo disponivel: " + getSaldoById(id) + " Euros.";
    }

    public void subtraiSaldoCliente(int id, double valor) {
        double novoSaldo = getSaldoById(id) - valor;
        getClienteById(id).setSaldo(novoSaldo);
    }

    public void adicionaSaldoCliente(int id, double valor) {
        double novoSaldo = getSaldoById(id) + valor;
        getClienteById(id).setSaldo(novoSaldo);
    }

    public void criarCliente(Cliente cliente) {
        clientes.add(cliente);
        alocarClienteAgencia(cliente);
    }

    public void alocarClienteAgencia(Cliente cliente) {
        for (int i = 0; i < agencias.size(); i++) {
            if (cliente.getNumAgencia() == agencias.get(i)) {
                agencias.get(i).
            }
            }
        }

    

    public void eliminarCliente(int numCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i);
            if (numCliente == clientes.get(i).getNumAgencia()) {
                clientes.remove(i);
            }
        }
    }

    public void updateClienteString(int id) {
        Cliente cliente = getClienteById(id);
    }

    public void listarClientes() {
        if (clientes.size() >= 1) {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Lista clientes - teste");
            }
        } else {
            System.out.println("De momento não existe nenhum cliente registado!");
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
