package exercises;


/*
 * 	Write a method called printPowersOf2 that accepts a maximum number as an argument and prints each power of 2 from 2^0 (1)
 *  up to that maximum power, inclusive. For example, consider the following calls:
 *   
 *   printPowersOf2(3);
 *   printPowersOf2(10);
 *   These calls should produce the following output:
 *   
 *   1 2 4 8
 *   1 2 4 8 16 32 64 128 256 512 1024
 *   You may assume that the value passed to printPowersOf2 is 0 or greater. (The Math class may help you with this problem. If you
 *   use it, you may need to cast its results from double to int so that you don't see a .0 after each number in your output. Also, can you 
 *   write this program without using the Math class?)
*/

public class PrintPowersOf2 {
	public static void main(String[] args) {
		System.out.println(printPowersOf2(3));
		System.out.println(printPowersOf2(10));

	}

	public static String printPowersOf2(int num) {
		String ans = "";
		for (int i = 0; i <= num; i++) {
			ans = ans + (int) Math.pow(2, i) + " ";
		}
		return ans;
	}
}
