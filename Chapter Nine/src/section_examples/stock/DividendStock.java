package section_examples.stock;

public class DividendStock extends Stock {
	private double dividend;

	public DividendStock(String symbl) {
		super(symbl);
		dividend = 0.0;
	}

	public void payDividend(double amountPerShare) {
		dividend += amountPerShare * getTotalShares();
	}

	@Override
	public double getProfit(double currPrice) {
		return super.getProfit(currPrice) + dividend;
	}

}
