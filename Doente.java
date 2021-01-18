import java.util.Random;
import java.util.Scanner;

public class Doente {

	/**
	 * nome do doente
	 */
	private String nome;

	/**
	 * numero de saude do doente
	 */
	private int numSNS;

	/**
	 * numero de nsc
	 */
	private static int nsc;

	/**
	 * localizacao actual do doente
	 */
	private Sala localizacao;

	Scanner in = new Scanner(System.in);

	/**
	 * Constructor
	 * @param nome nome do doente
	 */
	public Doente(String nome) {
		this.nome = nome;

		this.numSNS = setNumUtente();
		this.nsc = setNsc();
		this.localizacao = null;
		registaDoente(nome, numSNS, nsc, localizacao);
	}

	public int numUtente(int numSNS) {
		this.numSNS = numSNS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumUtente() {
		return numSNS;
	}

	public int setNumSNS() {
		System.out.print("Introduzir Numero de Utente: ");
		return in.nextInt();
	}

	public int getNsc() {
		return nsc;
	}

	public int setNsc() {
		Random rnd = new Random();
		do{
			int numero = rnd.nextInt(6);
			for (Doente d : )
		}while();
		return numero;
	}

	public Sala getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Sala localizacao) {
		this.localizacao = localizacao;
	}

	public void registaDoente(String nome, int numSNS, int nsc, Sala localizacao){
		Hospital hospital = new Hospital();
		hospital.setDoentes(doente);
	}
}
