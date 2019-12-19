package exercises;

/**
 * Write nested for loops to produce the following output:
 * 
 *     1
 *    2
 *   3
 *  4
 * 5
 */
public class SpacedNumbers {


	public static void main(String[] args) {
		System.out.println(spcdNmbrs());
	}
	
	public static String spcdNmbrs() {
		String ans = "";
		int space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < space; j++) {
				ans = ans + " ";
			}
			ans = ans + i + "\n";
			space = space - 1;
		}
		return ans;
	}

}
