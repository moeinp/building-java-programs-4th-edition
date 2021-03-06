package exercises;

/**
 * Modify your DollarFigure program from the previous exercise to become a new
 * program called DollarFigure2 that uses a global constant for the figure's
 * height. (You may want to make loop tables first.) The previous output used a
 * constant height of 7. The outputs below use a constant size of 3 (left) and 5
 * (right):
 * 
 * size 3	
 * $$$******$$$
 * **$$****$$**
 * ****$**$****
 * 
 * size 5
 * $$$$$**********$$$$$
 * **$$$$********$$$$**
 * ****$$$******$$$****
 * ******$$****$$******
 * ********$**$********
 *
 * (You must solve this problem using only ONE public static final constant, not
 * multiple constants; and its value must be used in the way described in this
 * problem.)
 */
public class DollarFigure2 {
	public static final int SIZE = 20;

	public static void main(String[] args) {
		System.out.println(dollaFig());
	}
	
	public static String dollaFig() {
		String ans = "";
		int big = 0;
		int dolla = SIZE;
		int mid = SIZE * 2;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < big; j++) {
				ans = ans + "*";
			}
			for (int j = 0; j < dolla; j++) {
				ans = ans + "$";
			}
			for (int j = 0; j < mid; j++) {
				ans = ans + "*";
			}
			for (int j = 0; j < dolla; j++) {
				ans = ans + "$";
			}
			for (int j = 0; j < big; j++) {
				ans = ans + "*";
			}
			big = big + 2;
			dolla = dolla - 1;
			mid = mid - 2;
			ans = ans + "\n";
			
		}
		return ans;
		
	}

}

