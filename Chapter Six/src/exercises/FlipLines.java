package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlipLines {
	public static void main(String[] args) throws FileNotFoundException {
		flipLines(new Scanner(new File("flipLines.txt")));
	}
	public static void flipLines(Scanner in) {
		String ans = "";
		while(in.hasNextLine()) {
			String firstLine = in.nextLine();
			if (in.hasNextLine()) {
				String secondLine = in.nextLine();
				ans += secondLine + "\n"; 
			}
			ans += firstLine + "\n";
		}
		System.out.println(ans);
	}


}
