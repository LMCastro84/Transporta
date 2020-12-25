package hospital.salas;

import hospital.doentes.Doente;
import java.util.ArrayList;

public class Sala {

    private String nomeSala;
    public ArrayList<Doente> doentesAlocados = new ArrayList<>();

    public Sala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public ArrayList<Doente> getDoentesAlocados() {
        return doentesAlocados;
    }

    public void setDoentesAlocados(ArrayList<Doente> doentesAlocados) {
        this.doentesAlocados = doentesAlocados;
    }

}
