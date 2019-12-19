package exercises;

/**
 * Modify your code from the previous exercise so that it could easily be
 * modified to display a different range of numbers (instead of 1234567890) and
 * a different number of repetitions of those numbers (instead of 60 total
 * characters), with the vertical bars still matching up correctly. Write a
 * complete class named NumbersOutput. Use two class constants instead of "magic
 * numbers,", with one constant set to 6 for the number of repetitions, and the
 * other set to 10 for the range of numbers. Put the for loop code in your
 * class's main method.
 * 
 * For example, if your number-of-repetitions constant is set to 7 and your
 * range constant is set to 5, the output should be the following:
 * 
 *     |    |    |    |    |    |    |
 * 12340123401234012340123401234012340
 * 
 * problem using only exactly two public static final constants, no more, no
 * less.)
 */
public class NumbersOutputConstant {
	public static final int NUMBER_OF_REPETITIONS = 6;
	public static final int RANG_OF_NUMBERS = 10;

	public static void main(String[] args) {
		System.out.println(numsConst());
	}

	public static String numsConst() {
		String ans = "";
		for (int j = 0; j < NUMBER_OF_REPETITIONS; j++) {

			for (int i = 1; i < RANG_OF_NUMBERS; i++) {
				ans = ans + " ";
			}
			ans = ans + "|";
		}
		ans = ans + "\n";
		for (int j = 1; j <= NUMBER_OF_REPETITIONS * RANG_OF_NUMBERS; j++) {

			ans = ans + (j % RANG_OF_NUMBERS);
		}
		return ans;
	}

}
