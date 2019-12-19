package exercises;

/**
 * The Fibonacci numbers are a sequence of integers in which the first two
 * elements are 1, and each following element is the sum of the two preceding
 * elements. The mathematical definition of each kth Fibonacci number is the
 * following: 
 * 
 * F(k): 
 * k > 2 : F(k-1) + F(k-2) 
 * k <= 2 : 1
 * 
 * The first 12 Fibonacci numbers are:
 * 
 * 1 1 2 3 5 8 13 21 34 55 89 144 
 * 
 * Write a piece of code that uses a for loop to
 * compute and print the first 12 Fibonacci numbers. (You may include other
 * code, such as declaring variables before the loop, if you like.)
 */
public class Fibonacci {

	public static void main(String[] args) {
		System.out.print(fib());
	}
	
	public static String fib() {
		String ans = "1 ";
		int i = 0;
		int j = 1; 
		int k = 0;
		for (int m = 0; m <= 10; m++) {
			k = i + j;
			i = j;
			j = k;
			ans = ans + k + " ";
		}
		return ans;
	}
	
	
	

}
