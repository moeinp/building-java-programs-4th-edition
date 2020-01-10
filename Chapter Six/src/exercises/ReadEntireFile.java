package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEntireFile {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print(readEntireFile(new Scanner(new File("collapseSpaces.txt"))));
	}
	public static String readEntireFile(Scanner in) {
		String ans = "";
		while(in.hasNextLine()) {
			ans += in.nextLine() + "\n";
		}
		return ans;
	}

}
