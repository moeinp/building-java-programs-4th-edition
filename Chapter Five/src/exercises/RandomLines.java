package exercises;

import java.util.Random;

public class RandomLines {

	public static void main(String[] args) {
		randomLines();
	}

	public static void randomLines() {
		Random rand = new Random();
		int lines = rand.nextInt(5) + 5;
		for (int i = 0; i < lines; i++) {
			int length = rand.nextInt(80);
			String ans = "";
			for (int j = 0; j < length; j++) {
				ans = ans + (char)('a' + rand.nextInt(26));
			}
			System.out.println(ans);
		}
	}
}
