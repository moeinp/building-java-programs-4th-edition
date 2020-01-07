package exercises;

import java.util.Iterator;
import java.util.Random;

public class RandomX {

	public static void main(String[] args) {
		randomX();
	}

	public static void randomX() {
		int random;
		Random rand = new Random();
		do {
			String ans = "";
			random = 5 + rand.nextInt(15);
			for (int i = 0; i < random; i++) {
				ans = ans + "x";
			}
			System.out.println(ans);
		} while (random < 16);
	}
}
