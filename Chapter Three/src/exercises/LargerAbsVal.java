package exercises;

/*
 * Write a method called largerAbsVal that takes two integers as parameters and returns the larger of the two absolute values. A call 
 * of largerAbsVal(11, 2) would return 11, and a call of largerAbsVal(4, -5) would return 5.
*/public class LargerAbsVal {
	public static void main(String[] args) {
		System.out.println(largerAbsVal(4,-5));
	}
	public static int largerAbsVal(int frst, int sec) {
		int firstNum = Math.abs(frst);
		int secontNum = Math.abs(sec);
		return(Math.max(firstNum, secontNum));
	}
}
