import java.util.*;

class KaninMoro {
	public static void main(String[] args) {
		Kanin kaninEn = new Kanin();
		kaninEn.settNavn("Roger");
		Kanin kaninTo = new Kanin();
		kaninTo.settNavn("Snurre");

		System.out.println(kaninEn);
		System.out.println(kaninTo);


		Kanin[] rekke = new Kanin[3];

		Kanin bob = new Kanin();
		bob.settNavn("Bob");
		rekke[0] = bob;

		Kanin[] rekke2 = {bob, new Kanin(), bob};

		System.out.println(Arrays.toString(rekke));
		System.out.println(Arrays.toString(rekke2));

		Kaninbur bobsHus = new Kaninbur();
		bobsHus.skrivUtBeboer();
		bobsHus.puttInnKanin(bob);
		bobsHus.skrivUtBeboer();
	}
}