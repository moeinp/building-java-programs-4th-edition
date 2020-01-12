package temp;

import java.util.Arrays;
import java.util.Random;

public class Temp {
		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5,6,7,8};
			int[] arr2 = {1,2,3};
			int[] arr3 = Arrays.copyOfRange(arr1, 2, 2+arr2.length);
			System.out.println(Arrays.toString(arr3));

		}
}
