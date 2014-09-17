class Parametre {
	public static void main(String[] args) {
		siHei("Erik");
		siHei("Anette");
		siHei(args[0]);
	}

	public static void siHei(String navn) {
		System.out.println("Hei " + navn);
		System.out.println("Hadet " + navn);
	}
}