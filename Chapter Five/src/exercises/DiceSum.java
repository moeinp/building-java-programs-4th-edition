package exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceSum {

	public static void main(String[] args) {
		diceSum();
		diceSum();
		diceSum();

	}

	public static void diceSum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int desired = scan.nextInt();
		Random rand = new Random();
		int diceOne;
		int diceTwo;
		do {
			diceOne = rand.nextInt(6) + 1;
			diceTwo = rand.nextInt(6) + 1;
			System.out.println(diceOne + " and " + diceTwo + " = " + (diceOne + diceTwo));
		} while ((diceOne + diceTwo) != desired);
	}
}
