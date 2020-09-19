package com.banco;

import com.banco.clientes.ClienteNormal;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Agencia agenciaPorto = new Agencia(1, "Avenida da Boavista", banco.clientesPorto);
        Agencia agenciaLisboa = new Agencia(2, "Avenida da Liberdade", banco.clientesLisboa);
        agencia.agencias.add(agenciaPorto);
        agencia.agencias.add(agenciaLisboa);
        
        
        banco.clientes.add(new ClienteNormal(1, 12565676, "Castro", "Foz-Porto", "Java Developer", "936960352", "luis.mbscastro@gmail.com", 1));
        banco.clientes.add(new ClienteNormal(2, 12565676, "Dias e Castro", "Lisboa", "Bank", "968966418", "marisadiasecastro@gmail.com", 2));
    }
}
