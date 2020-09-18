package com.banco.clientes;

public class ClienteVIP extends Cliente{
    
    private String gestorConta;

    public ClienteVIP(String gestorConta, int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia) {
        super(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia);
        this.gestorConta = gestorConta;
    }
    
}
