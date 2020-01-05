package exercise;

/*
 * Write a method named evenSum that prompts the user for many integers and print the total even sum and 
 * maximum of the even numbers. You may assume that the user types at least one non-negative even integer.
 * 
 * how many integers? 4
 * next integer? 2
 * next integer? 9
 * next integer? 18
 * next integer? 4
 * even sum = 24
 * even max = 18
 * */
import java.util.Scanner;

public class EvenSumMax {
	public static void main(String[] args) {
		evenSum();
	}

	public static void evenSum() {
		Scanner in = new Scanner(System.in);
		System.out.print("how many integers? ");
		int nums = in.nextInt();
		int sum = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < nums; i++) {
			System.out.print("next integer? ");
			int nxtInt = in.nextInt();
			if ((nxtInt > max) && ((nxtInt % 2) == 0)) {
				max = nxtInt;
			}
			if ((nxtInt % 2) == 0) {
				sum = sum + nxtInt;
			}
		}
		System.out.println("even sum = " + sum);
		System.out.println("even max = " + max);
		in.close();
	}
}
