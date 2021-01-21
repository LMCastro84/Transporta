import java.util.Scanner;

public class Transporta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Hospital hospitalFoz = new Hospital("da Foz", "Porto", "Norte");
		System.out.print("Introduza o nome do novo Doente: ");
		Doente doente1 = new Doente(in.nextLine());
	}
}
