package hospital;

import hospital.doentes.Doente;
import hospital.salas.Sala;

public class Main {
    public static void main(String[] args) {
        Doente doente1 = new Doente(1, "Antonio");
        Doente doente2 = new Doente(2, "Joao");
        Doente doente3 = new Doente(3, "Joaquim");
        Doente doente4 = new Doente(4, "Jose");
        Sala laranja = new Sala("Laranja");
        Sala rx = new Sala("Rx");
        laranja.doentesAlocados.add(doente1);
        laranja.doentesAlocados.add(doente2);
        rx.doentesAlocados.add(doente3);
        rx.doentesAlocados.add(doente4);
    }
}
