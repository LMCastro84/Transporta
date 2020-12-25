package hospital.doentes;

public class Doente {

    private int numDoente;
    private String nomeDoente;

    public Doente(int numDoente, String nomeDoente) {
        this.numDoente = numDoente;
        this.nomeDoente = nomeDoente;
    }

    public Doente() {
    }

    public int getNumDoente() {
        return numDoente;
    }

    public void setNumDoente(int numDoente) {
        this.numDoente = numDoente;
    }

    public String getNomeDoente() {
        return nomeDoente;
    }

    public void setNomeDoente(String nomeDoente) {
        this.nomeDoente = nomeDoente;
    }

}
