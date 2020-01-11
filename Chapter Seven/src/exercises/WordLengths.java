package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLengths {

	public static void main(String[] args) throws FileNotFoundException {
		wordLengths(new Scanner(new File("wordLength.txt")));
	}

	public static void wordLengths(Scanner in) {
		int[] track = new int[81];
		while (in.hasNext()) {
			String temp = in.next();
			track[temp.length()]++;
		}
		for (int i = 0; i < track.length; i++) {
			if (track[i] > 0) {
				System.out.print(i + ": " + track[i] + "\t");
				for (int j = 0; j < track[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

}
