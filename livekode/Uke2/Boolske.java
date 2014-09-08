class Boolske {
	public static void main(String[] args) {
		boolean b = false;
		int x = 0;

		System.out.println("b && !b = " + (b && !b));
		System.out.println("b || !b = " + (b || !b));
		System.out.println("b && x == 0 = " + (b && x == 0));
		System.out.println("b || x == 0 = " + (b || x == 0));
		System.out.println("!b && x == 0 = " + (!b && x == 0));
		System.out.println("!b || x == 0 = " + (!b || x == 0));
		System.out.println("b && x != 0 = " + (b && x != 0));
		System.out.println("b || x != 0 = " + (b || x != 0));
		System.out.println("!b && x != 0 = " + (!b && x != 0));
		System.out.println("!b || x != 0 = " + (!b || x != 0));
	}
}