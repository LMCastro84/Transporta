package com.banco.output;

import com.banco.Banco;
import java.util.Scanner;

public class Menu {

    public static void mainCabecalho() {
        Banco b = new Banco();
        System.out.println("*******************************************");
        System.out.println("===========================================");
        System.out.println("||       BEM VINDO AO " + b.getNomeBanco() + "!        ||");
        System.out.println("===========================================");
        System.out.println("*******************************************");
        System.out.println();
    }

    public static void mainMenu() {
        System.out.println("___________________________________________");
        System.out.println("-------------------------------------------");
        System.out.println("|            Escolha uma opcao:           |");
        System.out.println("-------------------------------------------");
        System.out.println("1-              Novo Cliente               ");
        System.out.println("2-      Lista de Clientes existentes       ");
        System.out.println("3-      Actualizar dados de Clientes       ");
        System.out.println("4-           Eliminar Clientes             ");
        System.out.println("5-          Transacoes/Consultas           ");
        System.out.println("6-                   Sair                  ");
        System.out.println("-------------------------------------------");
        System.out.println("___________________________________________");
    }

    public static String lerString() {
        String stringUser;
        Scanner in = new Scanner(System.in);
        stringUser = in.nextLine();
        return stringUser;
    }

    public static String lerStringMsg(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static int lerInt() {
        String intTexto;
        Scanner in = new Scanner(System.in);
        int intUser = 0;
        do {
            intTexto = in.nextLine();
            try {
                intUser = Integer.parseInt(intTexto);
            } catch (NumberFormatException nFE) {
                System.out.println(intTexto+ " nao e um valor numerico.");
            }
            return intUser;
        } while (!in.hasNextInt());
    }

    public static int lerIntMsg(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static long lerLong() {
        String longTexto;
        Scanner in = new Scanner(System.in);
        longTexto = in.nextLine();
        long longUser = Long.parseLong(longTexto);
        return longUser;
    }

    public static long lerLongMsg(String msg) {
        System.out.println(msg);
        return lerLong();
    }

    public static double lerDouble() {
        String doubleTexto;
        Scanner in = new Scanner(System.in);
        doubleTexto = in.nextLine();
        double doubleUser = Double.parseDouble(doubleTexto);
        return doubleUser;
    }

    public static double lerDoubleMsg(String msg) {
        System.out.println(msg);
        return lerDouble();
    }
}
