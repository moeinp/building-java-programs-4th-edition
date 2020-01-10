package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputStats {
	public static void main(String[] args) throws FileNotFoundException {
		inputStats(new Scanner(new File("inputStates.txt")));
	}

	public static void inputStats(Scanner in) {
		int line = 1;
		String maxLine = "";
		while (in.hasNextLine()) {
			System.out.print("Line " + line + " has ");
			String currLine = in.nextLine();
			if (currLine.length() > maxLine.length()) {
				maxLine = currLine;
			}
			Scanner currLineScane = new Scanner(currLine);
			int token = 0;
			int maxTok = 0;
			while (currLineScane.hasNext()) {
				String word = currLineScane.next();
				maxTok = Math.max(maxTok, word.length());
				token++;
			}
			System.out.println(token + " tokens (longest = " + maxTok + ")");
			line++;
		}
		System.out.println("Longest line: " + maxLine);
	}
}
