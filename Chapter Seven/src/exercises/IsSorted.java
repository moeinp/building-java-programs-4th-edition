package exercises;

public class IsSorted {

	public static void main(String[] args) {
		System.out.println(isSorted(new double[] {1.5, 4.3, 7.0, 19.5, 25.1, 46.2}));
		System.out.println(isSorted(new double[] {16.1, 12.3, 22.2, 14.4}));

	}
	public static boolean isSorted(double[] arr) {
		double first = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < first) {
				return false;
			}
			first = arr[i];
		}
		return true;
	}

}
