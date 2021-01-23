import java.util.Scanner;

public class Transporta {

	public static void main(String[] args) {
		Hospital hospitalFoz = new Hospital("da Foz", "Porto", "Norte");
		System.out.println("----TRANSPORTA----");
		System.out.println("Hospital " + hospitalFoz.getNome());
		Menu.mainMenu();
		Doente novoDoente = criaDoente();
		hospitalFoz.setListaGeralDoentes(novoDoente);
		hospitalFoz.setListaAdmissaoAdultos(novoDoente);
	}

	/**
	 * Cria um novo Doente
	 * 
	 * @return nodo Doente
	 */
	public static Doente criaDoente() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduza o nome do novo Doente: ");
		Doente novoDoente = new Doente(in.nextLine());
		return novoDoente;
	}
}
