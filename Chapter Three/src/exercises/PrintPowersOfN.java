package exercises;

/*
 * Write a method called printPowersOfN that accepts a base and an exponent as arguments and prints each power of the base from 
 * base^0 (1) up to that maximum power, inclusive. For example, consider the following calls:
 * 
 * printPowersOfN(4, 3);
 * printPowersOfN(5, 6);
 * printPowersOfN(-2, 8);
 * These calls should produce the following output:
 * 
 * 1 4 16 64
 * 1 5 25 125 625 3125 15625
 * 1 -2 4 -8 16 -32 64 -128 256
 * You may assume that the exponent passed to printPowersOfN has a value of 0 or greater. (The Math class may help you with this 
 * problem. If you use it, you may need to cast its results from double to int so that you don't see a .0 after each number in your
 *  output. Also, can you write this program without using the Math class?)
*/

public class PrintPowersOfN {
	public static void main(String[] args) {
		System.out.println(printPowersOfN(4,3));
		System.out.println(printPowersOfN(5,6));
		System.out.println(printPowersOfN(-2,8));

	}

	public static String printPowersOfN(int base, int exp) {
		String ans = "";
		for (int i = 0; i <= exp; i++) {
			ans = ans + (int)Math.pow(base, i) + " ";
		}
		return ans;

	}
}
