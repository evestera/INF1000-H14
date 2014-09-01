import java.util.Scanner;

public class Innlesing {
	public static void main(String[] args) {
		Scanner term = new Scanner(System.in);

		System.out.print("Et ord takk:");
		String ord = term.nextLine();

		System.out.println(ord);

		System.out.print("Et tall takk:");
		String tallTekst = term.nextLine();
		int tall = Integer.parseInt(tallTekst);

		System.out.println(tallTekst + 5);
	}
}
