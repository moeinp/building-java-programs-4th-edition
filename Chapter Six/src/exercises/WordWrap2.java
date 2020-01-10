package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class WordWrap2 {
	public static void main(String[] args) throws FileNotFoundException {
		wordWrap(new Scanner (new File("wordWrap.txt")),new PrintStream("wordWrap2.txt"));
	}
	public static void wordWrap(Scanner in,PrintStream out) {
  		while (in.hasNextLine()) {
			String line = in.nextLine();
			while(line.length() > 60) {
				out.print(line.substring(0,60) + "\n");
				line = line.substring(60,line.length());
			}
			out.print(line + "\n");
		}
	}

}
