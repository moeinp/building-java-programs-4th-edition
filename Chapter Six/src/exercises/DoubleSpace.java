package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class DoubleSpace {
	public static void main(String[] args) throws FileNotFoundException {
		doubleSpace(new Scanner(new File("collapseSpaces.txt")),new PrintStream("doubleSpace.txt"));
	}
	public static void doubleSpace(Scanner in, PrintStream out)  {
		while(in.hasNextLine()) {
			out.println(in.nextLine() + "\n");
		}
	}

}
