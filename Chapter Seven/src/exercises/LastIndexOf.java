package exercises;

public class LastIndexOf {

	public static void main(String[] args) {
		int[] arr = {74, 85, 102, 99, 101, 85, 56};
		System.out.println(lastIndexOf(arr , 85));
	}
	public static int lastIndexOf(int[] arr, int num) {
		for (int i = arr.length - 1; i >= 0 ; i--) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
