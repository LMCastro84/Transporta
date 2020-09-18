package com.banco;

import java.util.List;

public class Agencia extends Banco{
    
    public Agencia(int numAgencia, String moradaAgencia, List<Cliente> clientes) {
        super(numAgencia, moradaAgencia, clientes);
    }
    
}
