class Looping {
	public static void main(String[] args) {

		{

			int i = 0;
			while (i < 10) {
				System.out.println(i);
				i++;
			}
			System.out.println("Etterpå: " + i);

		}

		{

			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			// Etterpå: ikke lov å bruke i

		}

	}
}