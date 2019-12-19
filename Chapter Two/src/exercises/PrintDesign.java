package exercises;

/**
 * Write a method called printDesign that produces the following output. Use
 * nested for loops to capture the structure of the figure.
 * 
 * -----1----- 
 * ----333---- 
 * ---55555--- 
 * --7777777--
 * -999999999-
 * 
 */
public class PrintDesign {

	public static void main(String[] args) {
		System.out.println(printDesign());
	}

	public static String printDesign() {
		String ans = "";
		int nums = 1;
		int lines = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < lines; j++) {
				ans = ans + "-";
			}
			for (int j = 0; j < nums; j++) {
				ans = ans + nums;
			}
			for (int j = 0; j < lines; j++) {
				ans = ans + "-";
			}
			nums = nums + 2;
			lines = lines - 1;
			ans = ans + "\n";
		}
		return ans;
	}

}
