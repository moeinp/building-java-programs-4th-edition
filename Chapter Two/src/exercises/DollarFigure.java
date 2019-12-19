package exercises;

/**
 * Write a Java program called DollarFigure that produces the following output.
 * Use nested for loops to capture the structure of the figure.
 * 
 * $$$$$$$**************$$$$$$$
 * **$$$$$$************$$$$$$**
 * ****$$$$$**********$$$$$****
 * ******$$$$********$$$$******
 * ********$$$******$$$********
 * **********$$****$$**********
 * ************$**$************
 */
public class DollarFigure {

	public static void main(String[] args) {
		System.out.println(dollaFig());
	}
	
	public static String dollaFig() {
		String ans = "";
		int big = 0;
		int dolla = 7;
		int mid = 14;
		for (int i = 0; i < 7; i++) {
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
