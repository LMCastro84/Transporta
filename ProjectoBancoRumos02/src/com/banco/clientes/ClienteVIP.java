package com.banco.clientes;

import com.banco.cartoes.Cartao;
import com.banco.contas.Conta;
import com.banco.output.Menu;
import java.util.List;

public class ClienteVIP extends Cliente {

    public ClienteVIP(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, List<Conta> contas, List<Cartao> cartoes, String gestorConta) {
        super(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes, gestorConta);
    }

}
