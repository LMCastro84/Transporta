package com.rumos.banco;

import com.rumos.banco.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    String nomeBanco = "BANCO JAVA";
    List<Cliente> clientes = new ArrayList<>();

    String getNomeBanco() {
        return nomeBanco;
    }

    public Banco() {
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    //encontrar o cliente e remove-lo
    public void removerCliente(int numClt) {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i);
            if (numClt == clientes.get(i).numCliente) {
                clientes.remove(i);
            }
        }
    }

    //encontrar cliente, remove-lo e adicionar um novo
//    public void updateCliente(Cliente c) {
//        
//        removerCliente(c.numCliente);
//        adicionarCliente(c);
//    }
    public void updateClienteString(int id) {
        Cliente c = getClienteById(id);
//        clientes
    }

    public void listarClientes() {
        if (clientes.size() >= 1) {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Num Cliente: " + clientes.get(i).getNumCliente()
                        + "; Nome: " + clientes.get(i).getNome() + "; Num Conta: "
                        + clientes.get(i).getConta() + "; Num Cartao: " + clientes.get(i).getCartao()
                        + "; Saldo: " + clientes.get(i).getSaldo() + "€.");
            }
        } else {
            System.out.println("De momento não existe nenhum cliente registado!");
        }
    }

    public String getSaldoByIdString(int id) {
        return "Saldo do cliente numero : " + id + ": " + getSaldoById(id) + " Euros.";
    }

    public double getSaldoById(int id) {
        double saldoCliente = 0;
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getNumCliente()) {
                saldoCliente = clientes.get(i).getSaldo();
            }
        }
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

    public Cliente getClienteById(int id) {
        Cliente c = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getNumCliente()) {
                c = clientes.get(i);
            }
        }
        return c;
    }

    public String transfereSaldoString(int idOrigem, double transferencia, int idDestino) {
        subtraiSaldoCliente(idOrigem, transferencia);
        adicionaSaldoCliente(idDestino, transferencia);
        String mensagem1 = "Foram transferidos com sucesso " + transferencia
                + " Euros, do cliente numero " + getClienteById(idOrigem).getNumCliente()
                + " para o cliente numero" + getClienteById(idDestino).getNumCliente()
                + ".";
        String mensagem2 = "Novo saldo disponivel do cliente " + getClienteById(idOrigem).getNumCliente()
                + ": " + getSaldoById(idOrigem) + " Euros.";
        String mensagem3 = "Novo saldo disponivel do cliente " + getClienteById(idDestino).getNumCliente()
                + ": " + getSaldoById(idDestino) + " Euros.";
        return mensagem1 + mensagem2 + mensagem3;
    }

}
