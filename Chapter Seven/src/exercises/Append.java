package exercises;

import java.util.Arrays;

public class Append {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(append(new int[] {2, 4, 6}, new int[]{1, 2, 3, 4, 5})));

	}
	public static int[] append(int[]arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			ans[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			ans[i+arr1.length] = arr2[i];
		}
		return ans;
	}

}
