package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LeetSpeak {
	public static void main(String[] args) throws FileNotFoundException {
		leetSpeak(new Scanner(new File("leetSpeak.txt")), new PrintStream("leetSpeakOut.txt"));
	}

	public static void leetSpeak(Scanner in, PrintStream out) {
		String ans = "";
		while (in.hasNextLine()) {
			String currLine = in.nextLine();
			Scanner line = new Scanner(currLine);
			while (line.hasNext()) {
				String currWord = line.next();
				String word = "(";
				for (int i = 0; i < currWord.length(); i++) {
					if ((currWord.charAt(i) == 'o')) {
						word += '0';
					} else if (currWord.charAt(i) == 'l') {
						word += '1';
					} else if ((currWord.charAt(i) == 'e')) {
						word += '3';
					} else if ((currWord.charAt(i) == 'a')) {
						word += '4';
					} else if ((currWord.charAt(i) == 't')) {
						word += '7';
					} else if (((currWord.charAt(i) == 's')) && (i == currWord.length() - 1)) {
						word += 'Z';
					} else {
						word += currWord.charAt(i);
					}
				}
				ans += word + ") ";

			}
			ans += "\n";

		}
		out.println(ans);
	}

}
