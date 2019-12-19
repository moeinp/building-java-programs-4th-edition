package exercises;

/**
 * Modify your StarFigure code from the previous problem to use a constant for
 * the size. The outputs below use a constant size of 3 (left) and 6 (right):
 * 
 * size 3 
 * ////////\\\\\\\\ 
 * ////********\\\\
 * ****************
 * 
 * size 6 
 * ////////////////////\\\\\\\\\\\\\\\\\\\\
 * ////////////////********\\\\\\\\\\\\\\\\
 * ////////////****************\\\\\\\\\\\\
 * ////////************************\\\\\\\\
 * ////********************************\\\\
 * ****************************************
 * 
 * (You must solve this problem using only ONE public static final constant, not
 * multiple constants; and its value must be used in the way described in this
 * problem.)
 * 
 * 
 * 
 */
public class StarFigure2 {
	public static final int SIZE = 6;
	public static void main(String[] args) {
		System.out.println(strFig());
	}
	
	public static String strFig() {
		String ans = "";
		int slash = (SIZE - 1) * 4;
		int star = 0;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < slash; j++) {
				ans = ans + "/";
			}
			for (int j = 0; j < star; j++) {
				ans = ans + "*";
			}
			for (int j = 0; j < slash; j++) {
				ans = ans + "\\";
			}
			slash = slash - 4;
			star = star  + 8;
			ans = ans + "\n";
			
		}
		return ans;
	}

}
