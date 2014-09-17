class Oppg3 {
	public static void main(String[] args) {

		System.out.println("---- a ----");
		{
			int i = 0;
			while (i < 10) {
				i++;
			}
			System.out.println(i);
		}
		System.out.println();

		System.out.println("---- b ----");
		{
			for (int i = 1; i < 9; i += 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println("---- c ----");
		{
			String[] bokstaver = {"a", "h", "o", "l"};
			System.out.print(bokstaver[1]);
			System.out.print(bokstaver[0]);
			System.out.print(bokstaver[3]);
			System.out.print(bokstaver[3]);
			System.out.print(bokstaver[2]);
		}
		System.out.println();

		System.out.println("---- d ----");
		{
			String[] bokstaver = {"t", "e", "a", "m"};
			for (int i = 3; i > 0; i -= 2) {
			    System.out.print(bokstaver[i]);
			}
		}
		System.out.println();

	}
}