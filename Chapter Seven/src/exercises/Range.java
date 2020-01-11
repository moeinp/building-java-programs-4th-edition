package exercises;

public class Range {

	public static void main(String[] args) {

			int[] a1 = {8, 3, 5, 7, 2, 4};
			System.out.println(range(a1));
			

	}

	public static int range(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		return (max - min) + 1;

	}

}
