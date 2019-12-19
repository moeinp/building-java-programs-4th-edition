package exercises;

/**
 * Modify your code from the previous problem to produce the following output:
 * 
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 */
public class NestedNumbers2 {

	public static void main(String[] args) {
		System.out.println(nestedNums2());
	}

	public static String nestedNums2() {
		String ans = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 9; j >= 0; j--) {
				for (int k = 0; k < 5; k++) {
					ans = ans + j;
				}
			}
			ans = ans + "\n";
		}
		return ans;

	}

}
