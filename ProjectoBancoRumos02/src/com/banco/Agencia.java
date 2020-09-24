package com.banco;

import com.banco.clientes.Cliente;
import java.util.ArrayList;

public class Agencia extends Banco {

    public Agencia() {
    }

    public Agencia(int numAgencia, String moradaAgencia, ArrayList<Cliente> clientes) {
        super(numAgencia, moradaAgencia, clientes);
    }

}
