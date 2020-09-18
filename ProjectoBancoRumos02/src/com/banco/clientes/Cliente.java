package com.banco.clientes;

import com.banco.Agencia;

public class Cliente {

    private int numCliente;
    private long numCidadao;
    private String nome;
    private String morada;
    private String profissao;
    private String telefone;
    private String email;
    private int numAgencia;

    public Cliente(){}
    
    public Cliente(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia) {
        this.numCliente = numCliente;
        this.numCidadao = numCidadao;
        this.nome = nome;
        this.morada = morada;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
        this.numAgencia = numAgencia;
    }
    
    
}
