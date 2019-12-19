package exercises;

import java.util.Iterator;

/**
 * Write for loops to produce the following output:
 * 
 * *****
 * *****
 * *****
 * *****
 */
public class StarSquare {


	public static void main(String[] args) {
		System.out.println(strSqr());
	}
	
	public static String strSqr() {
		String ans = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				ans = ans + "*";
			}
			ans = ans + "\n";
		}
		return ans;
	}

}
