package exercises;

public class IsUnique {

	public static void main(String[] args) {
		System.out.println(isUnique(new int[] { 3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4 }));
	}

	public static boolean isUnique(int[] arr) {
		int[] sortedArr = new int[arr.length];
		for (int i = 0; i < sortedArr.length; i++) {
			int min = Integer.MAX_VALUE;
			int indexOfMin = 0;
			for (int j = 0; j < arr.length; j++) {
				if (min >= arr[j]) {
					min = arr[j];
					indexOfMin = j;
				}
			}
			sortedArr[i] = min;
			arr[indexOfMin] = Integer.MAX_VALUE;
		}

		for (int i = 1; i < sortedArr.length; i++) {
			if (sortedArr[i - 1] == sortedArr[i]) {
				return false;
			}
		}
		return true;
	}

}
