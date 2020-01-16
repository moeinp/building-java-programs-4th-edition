package case_study;

import java.util.Scanner;

public class StockMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// first Stock
		System.out.print("First stock's symbol: ");
		String firstStock = in.next();
		double firstStockNet = purchaseStock(in, firstStock);
		System.out.println("Net profit/loss: $" + firstStockNet);

		// second Stock
		System.out.print("Second stock's symbol: ");
		String seconfStock = in.next();
		double secondStockNet = purchaseStock(in, seconfStock);
		System.out.println("Net profit/loss: $" + secondStockNet);

		// compare two stocks
		if (firstStockNet > secondStockNet) {
			System.out.println(firstStock + " was more profitable than " + seconfStock + ".");
		} else {
			System.out.println(seconfStock + " was more profitable than " + firstStock + ".");

		}
	}

	public static double purchaseStock(Scanner in, String stock) {
		System.out.print("How many purchases did you make? ");
		int numOfPurchases = in.nextInt();
		Stock stck = new Stock(stock);
		for (int i = 1; i <= numOfPurchases; i++) {
			System.out.print(i + ": How many shares, at what price per share? ");
			int shares = in.nextInt();
			double price = in.nextDouble();
			stck.purchase(shares, price);
		}
		System.out.print("What is today's price per share?");
		double todayPriceF = in.nextDouble();
		return stck.getProfit(todayPriceF);
	}

}
