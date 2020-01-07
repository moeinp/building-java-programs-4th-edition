package exercises;

import java.util.Scanner;

public class PrintAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printAverage(in);
	}

	public static void printAverage(Scanner in) {
		double num = 0.0;
		double count = 0.0;
		int input;
		do {
			System.out.print("Type a number: ");
			input = in.nextInt();
			if (input >= 0) {
				num = num + (double) input;
				count = count + 1.0;
			}
		} while (input >= 0);
		if (num > 0) {
			System.out.println("Average was " + num / count);
		}
	}
}
