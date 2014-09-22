import java.util.*;

class Swap {
	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	public static void main(String[] args) {
		int[] tall = {1, 2, 3};
		System.out.println(Arrays.toString(tall));
		swap(tall, 0, 2);
		System.out.println(Arrays.toString(tall));
	}
}