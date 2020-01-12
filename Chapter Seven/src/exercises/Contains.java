package exercises;

import java.util.Arrays;

public class Contains {

	public static void main(String[] args) {
		int[] list1 = { 1, 6, 2, 1, 4, 1, 2, 1, 8 };
		int[] list2 = { 1, 2, 1 };
		System.out.println(contains(list1, list2));
	}

	public static boolean contains(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[0] && i <= arr1.length - arr2.length) {
				int[] temp = Arrays.copyOfRange(arr1, i, i + arr2.length);
				if (Arrays.equals(temp, arr2) == true) {
					return Arrays.equals(temp, arr2);
				}
			}

		}
		return false;
	}
}
