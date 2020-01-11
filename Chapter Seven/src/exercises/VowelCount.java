package exercises;

import java.util.Arrays;

public class VowelCount {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(vowelCount("i think, therefore i am")));
	}

	public static int[] vowelCount(String str) {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.toLowerCase().charAt(j) == 'a') {
				a++;
			} else if (str.toLowerCase().charAt(j) == 'e') {
				e++;
			} else if (str.toLowerCase().charAt(j) == 'i') {
				i++;
			} else if (str.toLowerCase().charAt(j) == 'o') {
				o++;
			} else if (str.toLowerCase().charAt(j) == 'u') {
				u++;
			}

		}
		return new int[] { a, e, i, o, u };
	}

}
