package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Agencia extends Banco{
    
    private int numAgencia;
    private String moradaAgencia;
    public List<Cliente> clientes = new ArrayList<>();    
    
    public Agencia(){}
    
    public Agencia(int numAgencia, String moradaAgencia, List<Cliente> clientes) {
        super(numAgencia, moradaAgencia, clientes);
    }
    
}
