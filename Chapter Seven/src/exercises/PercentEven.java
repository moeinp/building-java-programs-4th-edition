package exercises;

public class PercentEven {

	public static void main(String[] args) {

	}

	public static double percentEven(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		double numOfEvens = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				numOfEvens++;
			}
		}
		return numOfEvens / (double) arr.length * 100;
	}

}
