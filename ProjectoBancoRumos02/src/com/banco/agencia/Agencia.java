package com.banco.agencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private int numAgencia;
    private String moradaAgencia;
    public List<Cliente> clientes ArrayList<>();
    
    Menu menu = new Menu();

    public Agencia(int numAgencia, String moradaAgencia, List<Cliente> clientes) {
        this.numAgencia = numAgencia;
        this.moradaAgencia = moradaAgencia;
        this.clientes = clientes;
    }
    
    
}
