package exercises;

public class CountInRange {

	public static void main(String[] args) {
		System.out.println(countInRange(new int[] {14, 1, 22, 17, 36, 7, -43, 5}, 4, 17));
	}
	public static int countInRange(int[] arr, int min, int max) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= min && arr[i] <= max) {
				count ++;
			}
		}
		return count;
	}

}
