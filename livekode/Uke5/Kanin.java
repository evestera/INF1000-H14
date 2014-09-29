class Kanin {
	private String navn;

	void settNavn(String nyttNavn) {
		navn = nyttNavn;
	}

	String hentNavn() {
		return navn;
	}

	public String toString() {
		return navn;
	}
}