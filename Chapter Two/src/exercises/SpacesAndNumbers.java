package exercises;

/**
 * Write nested for loops to produce the following output:
 * 
 *     1
 *    22
 *   333
 *  4444
 * 55555
 */
public class SpacesAndNumbers {

	public static void main(String[] args) {
		System.out.println(spcsNmbrs());
	}

	public static String spcsNmbrs() {
		int spaces = 4;
		String ans = "";
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < spaces; j++) {
				ans = ans + " ";
			}
			spaces = spaces - 1;
			for (int j = 0; j < i; j++) {
				ans = ans + i;
			}
			ans = ans + "\n";
		}
		return ans;
	}
}
