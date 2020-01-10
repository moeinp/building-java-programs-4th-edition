package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordWrap3 {
	public static void main(String[] args) throws FileNotFoundException {
		wordWrap3(new Scanner(new File("wordWrap.txt")));
	}

	public static void wordWrap3(Scanner in) {
		String ans = "";
		while (in.hasNextLine()) {
			String currLine = in.next(), wrapedLine = "";
			Scanner line = new Scanner(currLine);
			while (currLine.length()>60) {
				String nextWord = line.next();
				if ((wrapedLine.length() + nextWord.length()) >= 60) {
					wrapedLine += nextWord + " ";
					currLine = in.next().substring(nextWord.length()-1,currLine.length());
				} 
				ans += wrapedLine;
			}
		}
		System.out.println("ans");
	}
}
