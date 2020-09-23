package com.banco.cartoes;

import com.banco.operacoes.Operacoes;

public class Cartao implements Operacoes {

    int numCartao;
    public static int contadorCartoes = 10000;

    public Cartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumCartao() {
        return numCartao;
    }
    
    public static Cartao novoCartaoDebito(){
        contadorCartoes++;
        int numCartao = contadorCartoes;
        return new CartaoDebito(numCartao);
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
