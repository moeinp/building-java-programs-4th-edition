package exercises;

public class Median {

	public static void main(String[] args) {
		System.out.println(median(new int[] { 5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17 }));
		System.out.println(median(new int[] { 42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27 }));
	}

	public static int median(int[] arr) {
		int[] sortedArr = new int[arr.length];
		for (int i = 0; i < sortedArr.length; i++) {
			int min = Integer.MAX_VALUE;
			int indexOFmin = 0;
			for (int j = 0; j < arr.length; j++) {

				if (min >= arr[j]) {
					min = arr[j];
					indexOFmin = j;
				}
			}
			sortedArr[i] = min;
			arr[indexOFmin] = Integer.MAX_VALUE;

		}
		return sortedArr[(arr.length / 2)];
	}

}
