package com.rumos.banco;

import com.rumos.banco.clientes.Cliente;
import com.rumos.banco.menu.Menu;

public class Main {

    public static void main(String[] args) {

        int id = 0;
        Banco banco = new Banco();
        Cliente cliente = new Cliente();

        banco.clientes.add(new Cliente(1, "Luis Castro", 123, "asds@asd", "prof", 4545, 5454, 5000));
        banco.clientes.add(new Cliente(2, "LMBSC", 456, "qwe@dfg.com", "java dev", 8778, 6556, 5400));

        Menu.mainCabecalho();

        int opcao = 6;

        do {
            Menu.mainMenu();

            opcao = Menu.lerInt();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("NOVO CLIENTE:");
                        System.out.println("Introduza o tipo de Cliente a criar:");
                        System.out.println("1- regular");
                        System.out.println("2- Retroceder");
                        opcao = Menu.lerInt();
                        switch (opcao) {
                            case 1:
                                Cliente c = Cliente.adicionarCliente();
                                banco.adicionarCliente(c);
                                break;
                            case 2:
                                Menu.mainMenu();
                            default:
                                System.out.println("Introduziu um valor inv�lido. \n"
                                        + "Tente novamente.");
                                System.out.println("-------------------------------------------");
                                break;
                        }
                    } while (opcao != 2);
                    break;
                case 2:
                    System.out.println("LISTA DE CLIENTES EXISTENTES:");
                    banco.listarClientes();
                    break;
                case 3:
                    System.out.println("ACTUALIZAR DADOS DE CLIENTES");
//                    banco.updateCliente(Cliente.updateCliente(Menu.lerIntMsg("Por favor, introduza o n�mero de Cliente para actualizar: ")));
                    System.out.println("Por favor, introduza o numero de Cliente a actualizar: ");
                    id = Menu.lerInt();
                    banco.updateClienteString(id);
                    break;
                case 4:
                    System.out.println("ELIMINAR CLIENTES:");
                    banco.removerCliente(Menu.lerIntMsg("Por favor, introduza o n�mero de Cliente a ser eliminado: "));
                    break;
                case 5:
                    do {
                        System.out.println("TRANSA��ES/CONSULTAS:");
                        System.out.println("1- Consultar Saldos");
                        System.out.println("2- Levatamentos");
                        System.out.println("3- Transferencias");
                        System.out.println("4- Retroceder");
//					System.out.println("4 - Retroceder");
                        opcao = Menu.lerInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("CONSULTA DE SALDOS");
                                System.out.println("Consultar Saldo do Cliente n�mero: ");
                                id = Menu.lerInt();
                                System.out.println(banco.getSaldoByIdString(id));
//                            Menu.lerIntMsg(null); //entrar no cliente atraves do seu n.�, e obter o seu saldo
                                break;
                            case 2:
                                System.out.println("LEVANTAMENTOS DE NUMER�RIO");
                                System.out.println("Levantar numer�rio do Cliente n�mero: ");
                                id = Menu.lerInt();
                                System.out.println("Numerario a ser levantado: ");
                                double levantamento = Menu.lerDouble();
                                System.out.println(banco.levantaSaldoClienteString(id, levantamento));
                                break;
                            case 3:
                                System.out.println("TRANSFER�NCIAS");
                                System.out.println("N�mero de Conta de origem: ");
                                int idOrigem = Menu.lerInt();
                                System.out.println("Introduzir Saldo a transferir: ");
                                double transferencia = Menu.lerDouble();
                                System.out.println("N�mero de Conta de Destino: ");
                                int idDestino = Menu.lerInt();
                                System.out.println(banco.transfereSaldoString(idOrigem, transferencia, idDestino));
                                break;
                            case 4:
                                Menu.mainMenu();
                            default:
                                System.out.println("===========================================");
                                System.out.println("Escolheu uma op��o inv�lida.");
                                System.out.println("Por favor, tente novamente:");
                                System.out.println("===========================================");
                                break;
                        }
                    } while (opcao != 4);
                    break;
                case 0:
                    System.out.println("===========================================");
                    System.out.println(" Obrigado por utilizar os nossos Servi�os! ");
                    System.out.println("               VOLTE SEMPRE!               ");
                    System.out.println("===========================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("===========================================");
                    System.out.println("Escolheu uma op��o inv�lida.");
                    System.out.println("Por favor, tente novamente:");
                    System.out.println("===========================================");
                    break;
            }

        } while (opcao != 0);

    }
}

