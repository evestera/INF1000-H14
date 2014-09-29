class Kaninbur {
	private Kanin borher;

	void puttInnKanin(Kanin nyKanin) {
		borher = nyKanin;
	}

	Kanin taUtKanin() {
		Kanin resultat = borher;
		borher = null;
		return resultat;
	}

	void skrivUtBeboer() {
		if (borher == null) {
			System.out.println("Ingen kanin her");
		} else {
			System.out.println(borher.hentNavn() + " bor her.");
		}
	}
}