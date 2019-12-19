package exercises;

/**
 * Write a program in a class named StarFigure that produces the following
 * output using for loops.
 * 
 * ////////////////\\\\\\\\\\\\\\\\ 
 * ////////////********\\\\\\\\\\\\
 * ////////****************\\\\\\\\ 
 * ////************************\\\\
 * ********************************
 * 
 */
public class StarFigure {

	public static void main(String[] args) {
		System.out.println(strFig());
	}
	
	public static String strFig() {
		String ans = "";
		int slash = 16;
		int star = 0;
		for (int i = 0; i < 5; i++) {
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
