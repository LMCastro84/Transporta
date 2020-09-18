package com.banco;

import com.banco.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Agencia extends Banco {

    public Agencia() {
    }

    public Agencia(int numAgencia, String moradaAgencia, List<Cliente> clientes) {
        super(numAgencia, moradaAgencia, clientes);
    }



}
