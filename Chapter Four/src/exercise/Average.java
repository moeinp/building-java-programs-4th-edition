package exercise;

/*
 * Write a method called average that takes two integers as parameters and returns the average of the 
 * two integers.
*/
public class Average {
	public static void main(String[] args) {
		System.out.println(average(3, 5));
	}

	public static double average(int a, int b) {
		return (a + b) / 2.0;
	}
}
