package exercises;

public class Contains {

	public static void main(String[] args) {

	}

	public static boolean contains(int[] arr1, int[] arr2) {
		int count = 1;
		if (arr2.length > arr1.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[0] && i <= arr1.length - arr2.length) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						System.out.println(arr1[i]);
						System.out.println(arr2[j]);

						count++;
					}
				}
				if (count == arr2.length) {
					System.out.println("pop");

					return true;
				}
				count = 1;
			}
		}
		return false;
	}

}
