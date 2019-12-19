/**
 * 
 */
package exercises;

/**
 * Write a Java program in a class named SlashFigure that produces the following
 * output. Use nested for loops to capture the structure of the figure. (If you
 * previously solved Self-Check problems 34 and 35 in the book, you will have
 * created a loop table that will be useful in solving this problem. Use it!)
 * 
 * !!!!!!!!!!!!!!!!!!!!!! 
 * \\!!!!!!!!!!!!!!!!!!// 
 * \\\\!!!!!!!!!!!!!!////
 * \\\\\\!!!!!!!!!!////// 
 * \\\\\\\\!!!!!!//////// 
 * \\\\\\\\\\!!//////////
 */
public class SlashFigure {


	public static void main(String[] args) {
		System.out.println(slshFig());
	}
	
	public static String slshFig() {
		String ans = "";
		int ex = 22; 
		int slash = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < slash; j++) {
				ans = ans + "\\";
			}
			for (int j = 0; j < ex; j++) {
				ans = ans + "!";
			}
			for (int j = 0; j < slash; j++) {
				ans = ans + "/";
			}
			ex = ex  - 4;
			slash = slash + 2; 
			ans = ans + "\n";
		}
		return ans;
	}

}
