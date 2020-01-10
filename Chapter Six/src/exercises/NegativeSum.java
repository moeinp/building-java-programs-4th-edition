package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NegativeSum {
	public static void main(String[] args) throws FileNotFoundException {
		negativeSum(new Scanner(new File("pos.txt")));
		negativeSum(new Scanner(new File("neg.txt")));

		
	}
	public static boolean negativeSum(Scanner in) {
		int count = 0, sum = 0;
		while(in.hasNextInt()) {
			count++;
			sum += in.nextInt();
			if (sum < 0) {
				System.out.println(sum +" after " + count + " steps");
				return true;
			}
		}
		System.out.println("no negative sum");
		return false;
	}

}
