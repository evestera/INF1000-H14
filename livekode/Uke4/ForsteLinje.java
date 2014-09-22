import java.util.*;
import java.io.*;

class ForsteLinje {
	public static boolean langForste(String filnavn)
			throws Exception {
		Scanner fil = new Scanner(new File(filnavn));

		if (fil.hasNextLine()) {
			String linje = fil.nextLine();
			return linje.length() > 5;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println(langForste("ForsteLinje.java"));
	}
}