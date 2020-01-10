package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) throws FileNotFoundException {
		evenNumbers(new Scanner(new File("numbers.txt")));
	}
	
	public static void evenNumbers(Scanner in) {
		int count = 0, sum = 0, evens = 0;
		while (in.hasNextInt()) {
			int currInt = in.nextInt();
			count++;
			sum += currInt;
			if ((currInt % 2 == 0)) {
				evens++;
			}

		}

		System.out.println(count + " numbers, sum = " + sum);
		double percent = ((double) evens / (double) count * 100);
		System.out.print(evens + " evens (");
		System.out.printf("%.2f%%)", percent);
	}

}
