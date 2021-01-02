package javahungrybanking;

import java.util.Scanner;

public class BankAccount {

    int saldo;
    int ultimaTransacao;
    String nomeCliente;
    String idCliente;

    public BankAccount(String nomeCliente, String idCliente) {
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
    }

    
    
    void depositar(int quantia) {
        if (quantia != 0) {
            saldo = saldo + quantia;
            ultimaTransacao = quantia;
        }
    }

    void levantar(int quantia) {
        if (quantia != 0) {
            saldo = saldo - quantia;
            ultimaTransacao = -quantia;
        }
    }

    void getUltimaTransacao() {
        if (ultimaTransacao > 0) {
            System.out.println("Depositado: " + ultimaTransacao);
        } else if (ultimaTransacao < 0) {
            System.out.println("Levantado: " + Math.abs(ultimaTransacao));
        } else {
            System.out.println("Nenhuma Transacao efectuada");
        }
    }

    void mostrarMenu() {
        char opcao = '0';
        Scanner scanner = new Scanner(System.in);
    }
}
