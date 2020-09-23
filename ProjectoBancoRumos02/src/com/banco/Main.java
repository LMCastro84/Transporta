package com.banco;

import com.banco.clientes.Cliente;
import com.banco.clientes.ClienteNormal;
import com.banco.contas.Conta;
import com.banco.contas.ContaOrdem;
import com.banco.output.Menu;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Agencia agenciaPorto = new Agencia(1, "Avenida da Boavista", banco.clientesPorto);
        Agencia agenciaLisboa = new Agencia(2, "Avenida da Liberdade", banco.clientesLisboa);
        agencia.agencias.add(agenciaPorto);
        agencia.agencias.add(agenciaLisboa);
        List<Conta> contas = new ArrayList<>();
        banco.clientesPorto.add(new Cliente(1, 654987654, "Castro", "Rua Andre", "Java Dev", "654987654", "asdçaij@asdlfj.com", 1, contas));
        Conta contaOrdem = new ContaOrdem(1, 4500);
        contas.add(contaOrdem);
//        System.out.println("Cliente " + banco.clientesPorto.get(0).getNome() + " Conta num " + contas.get(0).getNumConta() + " Saldo: " + contas.get(0).getSaldo() + "€.");
        System.out.println(banco.clientesPorto.get(0).contas.get(0).getSaldo());

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
                        System.out.println("1- Regular");
                        System.out.println("2- VIP");
                        System.out.println("3- Retroceder");
                        opcao = Menu.lerInt();
                        switch (opcao) {
                            case 1:
                                Cliente.contadorClientes++;
                                Cliente c = Cliente.novoClienteReg();
                                banco.adicionarCliente(c);
                                Conta.contadorContas++;
                                ContaOrdem cOrdem = Conta.novaContaOrdem();
                                c.contas.add(cOrdem);
                                break;
                            case 2:
                                Cliente.contadorClientes++;
                                Cliente cVIP = Cliente.novoClienteVIP();
                                banco.adicionarCliente(cVIP);
                            case 3:
                                break;
                            default:
                                System.out.println("Introduziu um valor inv�lido. \n"
                                        + "Tente novamente.");
                                System.out.println("-------------------------------------------");
                                break;
                        }
                    } while (opcao != 2);
                    break;
                case 2:
                    do {
                        System.out.println("LISTA DE CLIENTES EXISTENTES:");
                        System.out.println("Introduza a Agencia/Geral: ");
                        System.out.println("1- Agencia do Porto");
                        System.out.println("2- Agencia de Lisboa");
                        System.out.println("3- Lista global de Clientes");
                        System.out.println("0- Retroceder");
                        opcao = Menu.lerInt();
                        switch (opcao) {
                            case 1:
                                banco.listarClientesPorto();
                                break;
                            case 2:
//                                banco.listarClientesLisboa();
                                break;
                            case 3:
//                                banco.listarClientesGeral();
                                break;
                            default:
                                System.out.println("Introduziu um valor inv�lido. \n"
                                        + "Tente novamente.");
                                System.out.println("-------------------------------------------");
                                break;
                        }
                    } while (opcao != 0);
                    break;
                case 3:
                    System.out.println("ACTUALIZAR DADOS DE CLIENTES");
//                    banco.updateCliente(Cliente.updateCliente(Menu.lerIntMsg("Por favor, introduza o n�mero de Cliente para actualizar: ")));
                    System.out.println("Por favor, introduza o numero de Cliente a actualizar: ");
                    int id = Menu.lerInt();
//                    banco.updateClienteString(id);
                    break;
                case 4:
                    System.out.println("ELIMINAR CLIENTES:");
//                    banco.removerCliente(Menu.lerIntMsg("Por favor, introduza o n�mero de Cliente a ser eliminado: "));
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
//                                System.out.println(banco.getSaldoByIdString(id));
//                            Menu.lerIntMsg(null); //entrar no cliente atraves do seu n.�, e obter o seu saldo
                                break;
                            case 2:
                                System.out.println("LEVANTAMENTOS DE NUMER�RIO");
                                System.out.println("Levantar numer�rio do Cliente n�mero: ");
                                id = Menu.lerInt();
                                System.out.println("Numerario a ser levantado: ");
                                double levantamento = Menu.lerDouble();
//                                System.out.println(banco.levantaSaldoClienteString(id, levantamento));
                                break;
                            case 3:
                                System.out.println("TRANSFER�NCIAS");
                                System.out.println("N�mero de Conta de origem: ");
                                int idOrigem = Menu.lerInt();
                                System.out.println("Introduzir Saldo a transferir: ");
                                double transferencia = Menu.lerDouble();
                                System.out.println("N�mero de Conta de Destino: ");
                                int idDestino = Menu.lerInt();
//                                System.out.println(banco.transfereSaldoString(idOrigem, transferencia, idDestino));
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

//        banco.clientesGeral.add(new ClienteNormal(1, 12565676, "Castro", "Foz-Porto", "Java Developer", "936960352", "luis.mbscastro@gmail.com", 1, null));
//        Cliente clt = banco.clientesGeral.lastIndexOf(banco.clientesGeral);
//        
//
//        Cliente cliente2 = new ClienteNormal(2, 12565676, "Dias e Castro",
//                "Lisboa", "Bank", "968966418", "marisadiasecastro@gmail.com",
//                2, null);
//        banco.contas.add(new ContaOrdem(2, 4500));
////		Conta conta2 = new ContaOrdem(2, 4900);
////		cliente2.contas.add(conta2);
//        banco.clientesGeral.add(cliente2);
//        banco.alocarClienteGeralAgencia(cliente1);
//        banco.alocarClienteGeralAgencia(cliente2);
//        banco.listarClientesGeral();
//        banco.listarClientesAgencia(banco.clientesPorto);
//        banco.listarClientesAgencia(banco.clientesLisboa);
    }
}
