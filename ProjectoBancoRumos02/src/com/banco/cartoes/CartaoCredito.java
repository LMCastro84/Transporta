package com.banco.cartoes;

public class CartaoCredito extends CartaoBancario {

    private double plafond;

    public CartaoCredito(double plafond, int numCartao) {
        super(numCartao);
        this.plafond = plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }

    public double getPlafond() {
        return plafond;
    }

}
