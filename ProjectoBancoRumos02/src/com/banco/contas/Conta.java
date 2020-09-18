package com.banco.contas;

public class Conta {

    private int numConta;
    private double saldo;

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
    
    
}
