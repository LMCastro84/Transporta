import java.util.Scanner;

public class Transporta {
	
	public static void criaDoente (){
		Scanner in = new Scanner(System.in);
		System.out.print("Introduza o nome do novo Doente: ");
		Doente novoDoente = new Doente(in.nextLine());
		
}
	public static void main(String[] args) {
		Hospital hospitalFoz = new Hospital("da Foz", "Porto", "Norte");
		criaDoente();
		
		
	}
}
