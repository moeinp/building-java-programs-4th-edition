package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlusScores {
	public static void main(String[] args) throws FileNotFoundException {
		plusScores(new Scanner(new File("plusScore.txt")));
	}

	public static void plusScores(Scanner in) {
		while (in.hasNextLine()) {
			System.out.print(in.nextLine() + ":");
			String score = in.nextLine();
			double plus = 0, total = 0;
			for (int i = 0; i < score.length(); i++) {
				if (score.charAt(i) == '+') {
					plus++;
				}
				total++;
			}
			System.out.println(" " + (plus / total) *   100.0 + "% plus");
		}
	}
}
