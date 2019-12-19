package practice;

import java.util.ArrayList;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(DToB(90));
	}
	
	public static int DToB(int decimal) {
		ArrayList<Integer> allPowsOfTwo = new ArrayList<Integer>();
		int index = -1;
		while(Math.pow(2, index) < decimal) {
			index = index + 1;
			allPowsOfTwo.add((int) Math.pow(2, index));
		}
		int ans = 0;
		for (int i = allPowsOfTwo.size()-1; i >= 0; i--) {
			if (allPowsOfTwo.get(i) <= decimal) {
				ans = ans * 10;
				ans = ans + 1;
				decimal = decimal - allPowsOfTwo.get(i);
			}
			else {
				ans = ans * 10;
			}
		}
		return ans;
	}
}
