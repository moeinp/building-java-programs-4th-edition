package exercises;

public class Stdev {

	public static void main(String[] args) {
		System.out.println(stdev(new int[] { 1, -2, 4, -4, 9, -6, 16, -8, 25, -10 }));
	}

	public static double stdev(int[] arr) {
		double ave = 0;
		for (int i = 0; i < arr.length; i++) {
			ave += arr[i];
		}
		ave /= arr.length;
		double variance = 0;
		for (int i = 0; i < arr.length; i++) {
			variance += Math.pow((arr[i] - ave), 2);
		}
		variance = (variance / (arr.length - 1));
		return Math.sqrt(variance);
	}
}
