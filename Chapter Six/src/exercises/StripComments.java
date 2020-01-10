package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripComments {
	public static void main(String[] args) throws FileNotFoundException {
		stripComments(new Scanner(new File("stripComments.txt")));
	}

	public static void stripComments(Scanner input) {
		String ans = "";
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains("//")) {
				line = line.substring(0, line.indexOf("//"));
			}
			if (line.contains("/*") && !line.contains("*/")) {
				line = line.substring(0, line.indexOf("/*"));
			}
			if (line.contains("*/") && !line.contains("/*")) {
				line = line.substring(line.indexOf("*/")+2,line.length());
			}
			if (line.contains("/*") && line.contains("*/")) {
				line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/")+2, line.length());
			}
			if(line.length() > 0) {
			System.out.println(line);
			}
		}
	}

}
