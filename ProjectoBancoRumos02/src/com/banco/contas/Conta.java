package com.banco.contas;

import com.banco.clientes.Cliente;
import com.banco.operacoes.Operacoes;
import com.banco.output.Menu;

public class Conta implements Operacoes {

    private int numConta;
    public static int contadorContas = 0;
    private double saldo;

    public Conta() {
    }

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static Conta novaContaOrdem() {
        contadorContas++;
        int numConta = contadorContas;
        double saldo = Menu.lerDoubleMsg("Introduza o saldo para abrir a Conta a Ordem num "+numConta+": ");
        return new ContaOrdem(numConta, saldo);
    }

    @Override
    public void depositar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void levantar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
