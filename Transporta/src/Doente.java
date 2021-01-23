import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.ListAdapter;

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

	private static ArrayList<Integer> listaNSCs = new ArrayList<Integer>();

	/**
	 * localizacao actual do doente
	 */
	private Sala localizacao;

	Scanner in = new Scanner(System.in);

	/**
	 * Constructor
	 * 
	 * @param nome
	 *            do doente
	 */
	public Doente(String nome) {
		System.out.print("Novo Doente.\nPor favor Insira o numero de SNS: ");
		this.numSNS = in.nextInt();
		this.nsc = setNsc();
		this.localizacao = null;
		System.out.println("Doente criado.");
		System.out.println("Nome: "+nome+",\nNumero SNS: "+numSNS+",\nNSC: "+nsc);
	}

	/**
	 * 
	 * @return nome Doente
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumSNS() {
		return numSNS;
	}

	public static int getNsc() {
		return nsc;
	}

	public static int setNsc() {
		do {
			Doente.nsc = (int) (Math.random() * 7);
			for (int i = 0; i < Doente.listaNSCs.size(); i++) {
				if (Doente.listaNSCs.contains(Doente.nsc)) {
					break;
				} else {
					Doente.listaNSCs.add(Doente.nsc);
				}
			}
		} while (Doente.listaNSCs.contains(Doente.nsc));
		return Doente.nsc;
	}

	public Sala getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Sala localizacao) {
		this.localizacao = localizacao;
	}

}