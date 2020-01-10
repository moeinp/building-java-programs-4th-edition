package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) throws FileNotFoundException {
		coinFlip(new Scanner(new File("coinFlip.txt")));
	}

	public static void coinFlip(Scanner in) {
		while (in.hasNext()) {
			double countt = 0;
			double counth = 0;
			String cuurLine = in.nextLine();
			for (int i = 0; i < cuurLine.length(); i++) {
				if (cuurLine.toLowerCase().charAt(i) == 'h') {
					counth++;
				} else if (cuurLine.toLowerCase().charAt(i) == 't') {
					countt++;
				}
			}
			double percent = (counth/(countt+counth)*100);
			System.out.print((int)counth + " heads (");
			System.out.printf("%.1f%%)\n", percent);
			if (percent>50.0) {
				System.out.println("You win!");
			}
		}
	}

}
