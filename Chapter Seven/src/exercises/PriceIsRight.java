package exercises;

public class PriceIsRight {

	public static void main(String[] args) {
		int[] a1 = { 900, 885, 989, 1 };
		int[] a2 = { 200 };
		int[] a3 = { 500, 300, 241, 99, 501 };
		System.out.println(priceIsRight(a1, 800));
		System.out.println(priceIsRight(a2, 120));
		System.out.println(priceIsRight(a3, 50));

	}
	
	public static int priceIsRight(int[] bids, int price) {
		int bid = -1;
		int diff = Integer.MAX_VALUE;
		;
		for (int i = 0; i < bids.length; i++) {
			if ((price - bids[i] < diff) && price - bids[i] >= 0) {
				bid = bids[i];
				diff = price - bids[i];
			}
		}
		return bid;
	}

}
