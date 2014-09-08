import java.util.Scanner;

class LesIntFunksjon {
	public static void main(String[] args) {
		int a = lesInt("Skriv tall A: ");
		int b = lesInt("Skriv tall B: ");

		System.out.println(a + b);
	}

	public static int lesInt(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.print(prompt);
		int lest = in.nextInt();
		return lest;
	}
}