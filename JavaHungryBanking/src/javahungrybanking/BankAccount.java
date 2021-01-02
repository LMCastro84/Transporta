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

        System.out.println("Benvindo " + nomeCliente);
        System.out.println("O seu num de cliente e " + idCliente);
        System.out.println("");
        System.out.println("A- Conslutar saldo");
        System.out.println("B- Depositar");
        System.out.println("C- Levantar");
        System.out.println("D- Ultima Transacao");
        System.out.println("E- Sair");

        do {
            System.out.println("----------");
            System.out.println("Introduzir opcao");
            System.out.println("----------");            
            opcao = scanner.next().charAt(0);
            System.out.println("");
            
            switch(opcao){
                case 'A':
                    System.out.println("----------");
                    System.out.println("Saldo = "+saldo);
                    System.out.println("----------");
                    System.out.println("");
                    break;
                    
                case 'B':
                    System.out.println("----------");
                    System.out.println("Introduzir valor a depositar");
                    System.out.println("----------");
                    int quantia = scanner.nextInt();
                    depositar(quantia);
                    System.out.println("");
                    break;
                    
                case 'C':
                    System.out.println("----------");
                    System.out.println("Introduzir valor a levantar");
                    System.out.println("----------");
                    int quantia2 = scanner.nextInt();
                    levantar(quantia2);
                    System.out.println("");
                    break;
                    
                case 'D':
                    System.out.println("----------");
                    getUltimaTransacao();
                    System.out.println("----------");
                    System.out.println("");
                    break;
            }

        }while (opcao != 'E');
        
        System.out.println("Obrigado por utilizar os nossos servicos!");
    }

}
