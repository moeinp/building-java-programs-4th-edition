package exercises;

public class KthLargest {

	public static void main(String[] args) {
		System.out.println(kthLargest(2, new int[] { 74, 85, 102, 99, 101, 56, 84 }));
	}

	public static int kthLargest(int num, int[] arr) {
		int[] sortedArr = new int[arr.length];
		for (int i = 0; i < sortedArr.length; i++) {
			int currMin = Integer.MAX_VALUE;
			int indexOfMin = -1;
			for (int j = 0; j < arr.length; j++) {
				if (currMin >= arr[j]) {
					currMin = arr[j];
					indexOfMin = j;
				}
			}
			arr[indexOfMin] = Integer.MAX_VALUE;
			sortedArr[i] = currMin;
		}
		return sortedArr[sortedArr.length - num - 1];
	}

}
