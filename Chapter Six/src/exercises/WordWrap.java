package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordWrap {
	public static void main(String[] args) throws FileNotFoundException {
		wordWrap(new Scanner (new File("wordWrap.txt")));
	}
	public static void wordWrap(Scanner in) {
		String ans = "";
		while (in.hasNextLine()) {
			String line = in.nextLine();
			while(line.length() > 60) {
				ans += line.substring(0,60) + "\n";
				line = line.substring(60,line.length());
			}
			ans += line + "\n";
		}
		System.out.println(ans);
	}

}
