package exercises;

public class MinGap {

	public static void main(String[] args) {
		System.out.println(minGap(new int[] {1, 3, 6, 7, 12}));
	}

	public static int minGap(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, (arr[i] - arr[i - 1]));
		}
		return min;
	}

}
