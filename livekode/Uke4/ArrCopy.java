import java.util.*;

class ArrCopy {
	public static int[] copy(int[] copySource) {
		int[] copyResult = new int[copySource.length];
		for (int i = 0; i < copySource.length; i++) {
			copyResult[i] = copySource[i];
		}
		return copyResult;
	}

	public static void main(String[] args) {
		int[] test = {1, 2, 3};
		int[] testKopi = copy(test);

		testKopi[1] = 100;

		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(testKopi));
	}
}