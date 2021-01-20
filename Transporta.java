import java.util.Scanner;

public class Transporta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Hospital hospitalFoz = new Hospital("da Foz", "Porto", "Norte");
		Doente doente1 = new Doente(in.nextLine());
	}
}
