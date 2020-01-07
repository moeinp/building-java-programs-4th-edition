package exercises;

import java.util.Random;

public class MakeGuesses {

	public static void main(String[] args) {
		makeGuesses();
	}

	public static void makeGuesses() {
		Random rand = new Random();
		int guess;
		int count = 0;
		do {
			guess = rand.nextInt(50) + 1;
			count += 1;
			System.out.println("guess = "+guess);
		} while (guess < 48);
		System.out.println("total guesses = " + count);
	}
}
