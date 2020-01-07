package exercises;

import java.util.Random;

public class ThreeHeads {

	public static void main(String[] args) {
		threeHeads();
	}

	public static void threeHeads() {
		Random ran = new Random();
		int count = 0;
		while (count < 3) {
			boolean random = ran.nextBoolean();
			if(random) {
				System.out.print("H ");
				count += 1;
			}else {
				System.out.print("T ");
				count = 0;
			}
			 
		}		
		System.out.println();
		System.out.println("Three heads in a row!");
	}
}
