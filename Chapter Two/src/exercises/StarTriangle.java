package exercises;

/**
 * Write for loops to produce the following output:
 * *
 * **
 * ***
 * ****
 * *****
 */
public class StarTriangle {


	public static void main(String[] args) {
		System.out.println(strTrngl());

	}
	
	public static String strTrngl() {
		String ans = "";
		int k = 0;
		for (int i = 0; i < 5; i++) {
			k = k + 1;
			for (int j = 0; j < k; j++) {
				ans = ans + "*";
			}
			ans = ans + "\n";
		}
		return ans;
	}

}
