package com.banco.clientes;

import com.banco.Agencia;
import com.banco.cartoes.Cartao;
import com.banco.contas.Conta;
import com.banco.output.Menu;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int numCliente;
    public static int contadorClientes = 100;
    private long numCidadao;
    private String nome;
    private String morada;
    private String profissao;
    private String telefone;
    private String email;
    private int numAgencia;
    private int numCartao;
    public static int contadorCartoes = 0;
    public List<Conta> contas = new ArrayList<>();
    public List<Cartao> cartoes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, List<Conta> contas, List<Cartao> cartoes) {
        this.numCliente = numCliente;
        this.numCidadao = numCidadao;
        this.nome = nome;
        this.morada = morada;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
        this.numAgencia = numAgencia;
        this.contas = contas;
        this.cartoes = cartoes;
    }

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

    public void setContas(List<Conta> contas) {
        this.contas = contas;
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

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public static Cliente novoClienteReg() {
        int numCliente = contadorClientes;
        long numCidadao = Menu.lerLongMsg("Introduza numero de Cartao de Cidadao do Cliente num " + numCliente + ": ");
        String nome = Menu.lerStringMsg("Introduza o(s) nome(s) do Cliente num " + numCliente + ": ");
        String morada = Menu.lerStringMsg("Introduza a morada do Cliente num " + numCliente + ": ");
        String profissao = Menu.lerStringMsg("Introduza a profissao: do Cliente num " + numCliente + ": ");
        String telefone = Menu.lerStringMsg("Introduza o numero de telefone do Cliente num " + numCliente + ": ");
        String email = Menu.lerStringMsg("Introduza endereco de email do Cliente num " + numCliente + ": ");
        int numAgencia = Menu.lerIntMsg("Introduza o numero de Agencia: 1- Agencia Porto; 2- Agencia Lisboa: ");
        List<Conta> contas = new ArrayList<>();
        Conta contaOrdem = Conta.novaContaOrdem();
        contas.add(contaOrdem);
        List<Cartao> cartoes = new ArrayList<>();
        Cartao cartaoDebito = Cartao.novoCartaoDebito();
        cartoes.add(cartaoDebito);
        return new ClienteNormal(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes);
    }

    public static ClienteVIP novoClienteVIP() {
        int numCliente = contadorClientes;
        long numCidadao = Menu.lerLongMsg("Introduza numero de Cartao de Cidadao do Cliente num " + numCliente + ": ");
        String nome = Menu.lerStringMsg("Introduza o(s) nome(s) do Cliente num " + numCliente + ": ");
        String morada = Menu.lerStringMsg("Introduza a morada do Cliente num " + numCliente + ": ");
        String profissao = Menu.lerStringMsg("Introduza a profissao: do Cliente num " + numCliente + ": ");
        String telefone = Menu.lerStringMsg("Introduza o numero de telefone do Cliente num " + numCliente + ": ");
        String email = Menu.lerStringMsg("Introduza endereco de email do Cliente num " + numCliente + ": ");
        int numAgencia = Menu.lerIntMsg("Introduza o numero de Agencia: 1- Agencia Porto; 2- Agencia Lisboa: ");
        List<Conta> contas = new ArrayList<>();
        Conta contaOrdem = Conta.novaContaOrdem();
        contas.add(contaOrdem);
        List<Cartao> cartoes = new ArrayList<>();
        Cartao cartaoDebito = Cartao.novoCartaoDebito();
        cartoes.add(cartaoDebito);
        String gestorConta = Menu.lerStringMsg("Introduza o nome do Gestor da Conta do Cliente " + numCliente + ": ");
        return new ClienteVIP(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes, gestorConta);
    }

}
