package case_study;

public class Stock {
	private String stockSymbol;
	private int totalShares;
	private double totalCost;

	public Stock(String symbl) {
		if (symbl.equals(null)) {
			throw new NullPointerException();
		}
		this.stockSymbol = symbl;
		this.totalShares = 0;
		this.totalCost = 0.0;
	}

	public void purchase(int numOfShares, double PricePerShare) {
		if (numOfShares < 0 || PricePerShare < 0) {
			throw new IllegalArgumentException();
		}
		this.totalShares += numOfShares;
		this.totalCost += PricePerShare * numOfShares;
	}
	
	public double getProfit(double currPrice) {
		if(currPrice < 0) {
			throw new IllegalArgumentException();
		}
		return (currPrice * totalShares) - (totalCost);
	}

}
