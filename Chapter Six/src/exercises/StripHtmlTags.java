package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripHtmlTags {
	public static void main(String[] args) throws FileNotFoundException {
		stripHtmlTags(new Scanner(new File("stripHTML.txt")));
	}

	public static void stripHtmlTags(Scanner in) {
		while (in.hasNextLine()) {
			String currentLine = in.nextLine();
			while (currentLine.contains("<") || currentLine.contains(">")) {
				currentLine = currentLine.substring(0, currentLine.indexOf('<'))
						+ currentLine.substring(currentLine.indexOf('>') + 1, currentLine.length());
			}
			System.out.println(currentLine);
		}
	}

}
