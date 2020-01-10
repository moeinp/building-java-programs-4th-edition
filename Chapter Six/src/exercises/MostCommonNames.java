package exercises;

import java.util.Scanner;

public class MostCommonNames {
	public static void main(String[] args) {
		mostCommonNames(new Scanner("Benson Eric   Eric  Marty Kim  Kim Kim   Jenny  Nancy Nancy  Nancy  Paul  Paul\n"));
	}
	public static void mostCommonNames(Scanner in) {		
		while(in.hasNextLine()){
			String currentLine = in.nextLine();
			Scanner CurrentLineScan = new Scanner(currentLine);
			String word1 = CurrentLineScan.next();
			int lineUnique = 1;
			String commonName = "";
			int commonNameCount = 0;
			while (CurrentLineScan.hasNext()) {
				String Word2 = CurrentLineScan.next();
				
			}
			
			
		}
	}

}
