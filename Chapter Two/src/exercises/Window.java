package exercises;

/**
 * Write a Java program in a class named Window that produces the preceding
 * figure as output. Use nested for loops to print the repeated parts of the
 * figure. Once you get it to work, add one class constant to your program so
 * that the size of the figure can be changed simply by changing that constant's
 * value. The example output shown is at a constant size of 3, but if you change
 * the constant, the figure should grow larger and wider proportionally.
 * 
 * +===+===+ 
 * |   |   |
 * |   |   | 
 * |   |   | 
 * +===+===+ 
 * |   |   | 
 * |   |   | 
 * |   |   | 
 * +===+===+
 * 
 * (You must solve this problem using only ONE public static final constant, not
 * multiple constants; and its value must be used in the way described in this
 * problem.)
 */
public class Window {

	public static final int SIZE = 5;

	public static void main(String[] args) {
		System.out.println(wndw());

	}

	public static String wndw() {
		return (fram() + glass() + fram() + glass() + fram());
	}

	public static String fram() {
		String ans = "";
		for (int i = 0; i < 2; i++) {
			ans = ans + "+";
			for (int j = 0; j < (SIZE); j++) {
				ans = ans + "=";
			}
		}
		ans = ans + "+\n";
		return ans;
	}

	public static String glass() {
		String ans = "";
		for (int k = 0; k < SIZE; k++) {
			for (int i = 0; i < 2; i++) {
				ans = ans + "|";
				for (int j = 0; j < (SIZE); j++) {
					ans = ans + " ";
				}
			}
			ans = ans + "|\n";
		}
		return ans;
	}

}
