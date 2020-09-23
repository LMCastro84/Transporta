package com.banco.clientes;

import com.banco.cartoes.CartaoBancario;
import com.banco.contas.Conta;
import java.util.List;

public class ClienteVIP extends Cliente {

    private String gestorConta;

    public ClienteVIP(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, List<Conta> contas, List<CartaoBancario> cartoes, String gestorConta) {
        super(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes);
        this.gestorConta = gestorConta;
    }

    public void setGestorConta(String gestorConta) {
        this.gestorConta = gestorConta;
    }

    public String getGestorConta() {
        return gestorConta;
    }

}
