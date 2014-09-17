class StringArray {
	public static void main(String[] args) {
		String[] dyr = new String[5];

		dyr[0] = "Hest";
		dyr[1] = "Okse";
		dyr[2] = "Ku";
		dyr[3] = "Gris";
		dyr[4] = "Høne";

		for (int i = 0; i <= dyr.length; i++) {
			System.out.println(i);
			System.out.println(dyr[i]);
		}
	}
}