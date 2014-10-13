import java.util.ArrayList;

class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList<String> navn = new ArrayList<String>();

		//ArrayListString navn = new ArrayListString(100);
		System.out.println(navn.size());
		navn.add("Erik");
		navn.add("Anette");
		System.out.println(navn.size());

		if (navn.contains("Erik")) {
			System.out.println("Erik er der!");
		} else {
			System.out.println("Erik er ikke der!");
		}

		System.out.println(navn.get(1));

		System.out.println(navn.indexOf("Anette"));

		navn.add("Karin");
		navn.add("Marianne");

		//navn.remove(1);
		//System.out.println(navn.size());

		/*
		for (int i = 0; i < navn.size(); i++) {
			System.out.println(navn.get(i));
		}
		*/

		System.out.println(navn);

		navn.remove(1);
		System.out.println(navn);
		navn.add(1, "Anette");
		System.out.println(navn);
		navn.set(3, "Kjetil");
		System.out.println(navn);
		navn.remove("Erik");
		System.out.println(navn);
		navn.remove("Kåre");


	}
}