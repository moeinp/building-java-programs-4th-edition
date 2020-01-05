package exercise;

import java.util.Scanner;

public class LongestName {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		longestName(console, 5);
	}
	public static void longestName(Scanner in, int num) {
		String longestName = "";
		for (int i = 1; i <= num; i++) {
			System.out.print("name #" + i + "? ");
			String currName = in.next();
			if(currName.length() > longestName.length()) {
				longestName = currName;
			}
		}
		System.out.println(longestName.toLowerCase());
	}
}
