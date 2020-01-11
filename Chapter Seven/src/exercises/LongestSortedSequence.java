package exercises;

public class LongestSortedSequence {

	public static void main(String[] args) {

	}

	public static int longestSortedSequence(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int allTimeMax = 1;
		int currentMax = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] <= arr[i]) {
				currentMax++;
			} else {
				currentMax = 1;
			}
			allTimeMax = Math.max(currentMax, allTimeMax);
		}
		return allTimeMax;
	}

}
