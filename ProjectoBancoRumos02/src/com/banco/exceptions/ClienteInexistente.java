package com.banco.exceptions;

public class ClienteInexistente extends Exception{
    public void clienteInexistente(){
        System.out.println("Introduziu um numero de Cliente inexistente!");
        System.out.println("Por favor tente novamente: ");
    }
}
