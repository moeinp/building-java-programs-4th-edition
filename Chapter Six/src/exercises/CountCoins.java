package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountCoins {
	public static void main(String[] args) throws FileNotFoundException {
		countCoins(new Scanner(new File("countCoins$1.09.txt")));
		countCoins(new Scanner(new File("countCoins$3.84.txt")));

	}

	public static void countCoins(Scanner in) {
		double amountOfMoney = 0.0;
		while (in.hasNextInt()) {
			int numberOfCoins = in.nextInt();
			String coin = in.next();
			if (coin.toLowerCase().contentEquals("pennies")) {
				amountOfMoney += (numberOfCoins * .01);
			} else if (coin.toLowerCase().contentEquals("quarters")) {
				amountOfMoney += (numberOfCoins * .25);
			} else if (coin.toLowerCase().contentEquals("nickels")) {
				amountOfMoney += (numberOfCoins * .05);
			} else {
				amountOfMoney += (numberOfCoins * .10);
			}
		}
		System.out.print("Total money: $" );
		System.out.printf("%.2f \n", amountOfMoney);
	}

}
