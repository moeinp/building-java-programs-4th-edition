package exercises;

/*
 * Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. For 
 * example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
*/

public class LargestAbsVal {
	public static void main(String[] args) {
		System.out.println(largestAbsVal(7,-2,-11));
		System.out.println(largestAbsVal(-4,5,2));
		
	}
	public static int largestAbsVal(int frst, int sec, int thrd) {
		int numOne = Math.abs(frst);
		int numTwo = Math.abs(sec);
		int numThree = Math.abs(thrd);
		
		return Math.max(Math.max(numOne, numTwo), numThree);
	}

}
