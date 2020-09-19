package com.banco;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Agencia agenciaPorto = new Agencia(1, "Avenida da Boavista", banco.clientesPorto);
        Agencia agenciaLisboa = new Agencia(2, "Avenida da Liberdade", banco.clientesLisboa);
        agencia.agencias.add(agenciaPorto);
        agencia.agencias.add(agenciaLisboa);
    }
}
