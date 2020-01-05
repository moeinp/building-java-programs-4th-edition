package exercise;

import java.util.Scanner;

/*
 * Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest 
 * and largest of all the numbers typed in by the user. You may assume the user enters a valid number 
 * greater than 0 for the number of numbers to read. Here is an example dialogue:
 * 
 * How many numbers do you want to enter? 4
 * Number 1: 5
 * Number 2: 11
 * Number 3: -2
 * Number 4: 3
 * Smallest = -2
 * Largest = 11
 * */
public class SmallestLargest {
	public static void main(String[] args) {
		smallestLargest();
	}

	public static void smallestLargest() {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		int loop = in.nextInt();
		for (int i = 1; i <= loop; i++) {
			System.out.print("Number " + i + ": ");
			int temp = in.nextInt();
			if (low > temp) {
				low = temp;
			}
			if (high < temp) {
				high = temp;
			}

		}
		System.out.println("Smallest = " + low);
		System.out.println("Largest = " + high);
		in.close();
	}
}
