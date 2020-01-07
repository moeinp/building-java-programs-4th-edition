package exercises;

import java.util.Random;

public class RandomWalk {

	public static void main(String[] args) {
		randomWalk();
		}

	public static void randomWalk() {
		Random ran = new Random();
		int max = 0;
		int pos = 0; 
		System.out.println("position = "+pos);
		while((pos < 3)&&(pos > -3)) {
			pos = pos - (ran.nextInt(2)*2-1);
			System.out.println("position = "+pos);
			max = Math.max(max, pos);
		}
		System.out.println("max position = "+max);
	}
}
