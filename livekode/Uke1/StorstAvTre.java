import java.util.Scanner;

public class StorstAvTre {
	public static void main(String[] args) {
		Scanner term = new Scanner(System.in);
		
		System.out.print("Tall 1:");
		int a = Integer.parseInt(term.nextLine());
		System.out.print("Tall 2:");
		int b = Integer.parseInt(term.nextLine());
		System.out.print("Tall 3:");
		int c = Integer.parseInt(term.nextLine());

		if (a >= b && a >= c) {
			System.out.println(a + " a ");
		} else if (b >= c) {
			System.out.println(b + " b ");
		} else {
			System.out.println(c + " c ");
		}
	}
}
