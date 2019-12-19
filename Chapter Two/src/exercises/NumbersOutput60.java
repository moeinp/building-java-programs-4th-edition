package exercises;

/**
 * t's common to print a rotating, increasing list of single-digit numbers at
 * the start of a program's output as a visual guide to number the columns of
 * the output to follow. With this in mind, write nested for loops to produce
 * the following output, with each line 60 characters wide:
 * 
 *          |         |         |         |         |         |
 * 123456789012345678901234567890123456789012345678901234567890
 */
public class NumbersOutput60 {

	public static void main(String[] args) {
		System.out.println(nums60());
	}

	public static String nums60() {
		String ans = "";
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 9; j++) {
				ans = ans + " ";
			}
			ans = ans + "|";
		}
		ans = ans + "\n";
		for(int i = 1; i < 61; i++) {
			ans = ans + (i % 10);
		}
		return ans;
	}
	

}
