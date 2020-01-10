package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CollapseSpaces {
	public static void main(String[] args) throws FileNotFoundException {
		collapseSpaces(new Scanner(new File("collapseSpaces.txt")));
	}

	public static void collapseSpaces(Scanner in) {
		while (in.hasNextLine()) {
			String currLine = in.nextLine();
			Scanner curr = new Scanner(currLine);
			while (curr.hasNext()) {
				System.out.print(curr.next());
				if(curr.hasNext()) {
					System.out.print(" ");

				}
			}
			System.out.println();
			curr.close();
		}
	}

}
