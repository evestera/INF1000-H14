import java.util.*;
import java.io.*;

class Kommentering {
	public static void main(String[] args) throws Exception {
		Scanner fil = new Scanner(new File(args[0]));
		PrintWriter utfil = new PrintWriter(args[0] + ".kommentert");

		while (fil.hasNextLine()) {
			String linje = fil.nextLine();
			if (linje.length() > 0) {
				System.out.println(linje);
				System.out.println("Har du en kommentar?");
				String kommentar = new Scanner(System.in).nextLine();
				utfil.println("// " + kommentar);
			}
			utfil.println(linje);
		}

		utfil.close();
	}
}