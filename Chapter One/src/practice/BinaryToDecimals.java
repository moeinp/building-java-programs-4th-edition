package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryToDecimals {
	public static void main(String[] args) {
		System.out.println(bToD(1001010));
	}

	//enter a valid binary number with no leading zeros
	public static int bToD(int binary) {
		ArrayList<Integer> binaryArr = new ArrayList<Integer>();
		ArrayList<Integer> powsOfTwo = new ArrayList<Integer>();
		int temp = 0;
		int indexForpowOfTwo = 0;
		while (binary > 0) {
			temp = binary % 10;
			binaryArr.add(temp);
			binary = binary / 10;
			powsOfTwo.add((int) Math.pow(2, indexForpowOfTwo));
			indexForpowOfTwo = indexForpowOfTwo + 1;
		}
		int ans = 0;
		for (int i = 0; i < binaryArr.size(); i++) {
			if (binaryArr.get(i) == 1) {
				ans = ans + powsOfTwo.get(i);
			}
			if(binaryArr.get(i) > 1) {
				return -1;
			}
		}
		return ans;
	}

}
