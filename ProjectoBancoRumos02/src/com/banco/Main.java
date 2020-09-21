package com.banco;

import com.banco.clientes.Cliente;
import com.banco.clientes.ClienteNormal;
import com.banco.contas.Conta;
import com.banco.contas.ContaOrdem;
import com.banco.output.Menu;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Agencia agenciaPorto = new Agencia(1, "Avenida da Boavista", banco.clientesPorto);
        Agencia agenciaLisboa = new Agencia(2, "Avenida da Liberdade", banco.clientesLisboa);
        agencia.agencias.add(agenciaPorto);
        agencia.agencias.add(agenciaLisboa);
        
        Menu.mainCabecalho();
        
        int opcao = 6;
        
        do{
            Menu.mainMenu();
        }while (opcao != 0);
        
        
        
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
