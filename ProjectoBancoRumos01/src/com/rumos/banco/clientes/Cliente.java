package com.rumos.banco.clientes;

public class Cliente {

    int numCliente, telefone, conta, cartao;
    String nome, email, profissao;
    double saldo;
    Banco b = new Banco();

    public Cliente() {
    }

    public Cliente(int numCliente, String nome, int telefone, String email, String profissao, int conta, int cartao, double saldo) {
        this.numCliente = numCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.profissao = profissao;
        this.conta = conta;
        this.cartao = cartao;
        this.saldo = saldo;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getConta() {
        return conta;
    }

    public int getCartao() {
        return cartao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getProfissao() {
        return profissao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarCliente() {
        System.out.println(clientesString());
    }

    public String clientesString() {
        return "Cliente num: " + numCliente + "; Nome: " + nome + "; Num Conta: " + conta + "; Num Cartao: " + cartao + "; Saldo: " + saldo + ".";
    }

    public static Cliente adicionarCliente() {
        int numCliente = Menu.lerIntMsg("Introduza n�mero de Cliente: ");
        String nome = Menu.lerStringMsg("Introduza o(s) nome(s) do Cliente: ");
        int telefone = Menu.lerIntMsg("Introduza o n�mero de telefone: ");
        String email = Menu.lerStringMsg("Introduza endere�o de email: ");
        String profissao = Menu.lerStringMsg("Introduza a profiss�o: ");
        int conta = Menu.lerIntMsg("Introduza n�mero de conta atribuida: ");
        int cartao = Menu.lerIntMsg("Introduza n�mero de cart�o atribuido: ");
        double saldo = Menu.lerDoubleMsg("Introduza Saldo para abrir nova conta: ");
        return new Cliente(numCliente, nome, telefone, email, profissao, conta, cartao, saldo);
    }

    public static Cliente updateCliente(int numCliente) {
        String nome = Menu.lerStringMsg("Introduza o(s) novo(s) nome(s) do Cliente " + numCliente + ": ");
        int telefone = Menu.lerIntMsg("Introduza o novo n�mero de telefone do Cliente " + numCliente + ": ");
        String email = Menu.lerStringMsg("Introduza o novo endere�o de email do Cliente " + numCliente + ": ");
        String profissao = Menu.lerStringMsg("Introduza a nova profiss�o do Cliente " + numCliente + ": ");
        int conta = Menu.lerIntMsg("Introduza o novo n�mero de conta atribu�da do Cliente " + numCliente + ": ");
        int cartao = Menu.lerIntMsg("Introduza o novo n�mero de cart�o atribu�do do Cliente " + numCliente + ": ");
        double saldo = Menu.lerDoubleMsg("Introduza o saldo do Cliente " + numCliente + ": ");
        return new Cliente(numCliente, nome, telefone, email, profissao, conta, cartao, saldo);
    }

}
