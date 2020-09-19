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

    public Cliente() {
    }

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

    Cliente clienteTeste = new ClienteNormal(1, 12565676, "Castro", "Foz-Porto", "Java Developer", "936960352", "luis.mbscastro@gmail.com", 1);
    
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setNumCidadao(long numCidadao) {
        this.numCidadao = numCidadao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public long getNumCidadao() {
        return numCidadao;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

}
