import java.util.*;
import java.io.*;

class Cat {
	public static void main(String[] args) throws IOException {
		Scanner fil = new Scanner(new File(args[0]));

		while (fil.hasNextLine()) {
			System.out.println(fil.nextLine());
		}
	}
}