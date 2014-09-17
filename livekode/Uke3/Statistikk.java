import java.util.*;

class Statistikk {
	public static void main(String[] args) {
		int antallTall = lesInt("Hvor mange tall: ");

		int[] tallene = new int[antallTall];

		for (int i = 0; i < tallene.length; i++) {
			tallene[i] = lesInt("Tall: ");
		}

		int storsteTall = Integer.MIN_VALUE;

		for (int i = 0; i < tallene.length; i++) {
			if (tallene[i] > storsteTall) {
				storsteTall = tallene[i];
			}
		}

		System.out.println("Største tall: " + storsteTall);
	}

	public static int lesInt(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.print(prompt);
		int lest = in.nextInt();
		return lest;
	}
}