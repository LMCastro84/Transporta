package com.banco.clientes;

import com.banco.cartoes.CartaoBancario;
import com.banco.contas.Conta;
import java.util.ArrayList;
import java.util.List;

public class ClienteNormal extends Cliente {

    public ClienteNormal(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, ArrayList<Conta> contas, ArrayList<CartaoBancario> cartoes) {
        super(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes);
    }

}
