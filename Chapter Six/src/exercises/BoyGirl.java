package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoyGirl {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("tas.txt"));
		boyGirl(in);
	}

	public static void boyGirl(Scanner input) {

		int count = 0, boy = 0, girl = 0, countB = 0, countG = 0;
		boolean gender = true;
		while (input.hasNext()) {
			String dumm = input.next();
			if (gender) {
				boy = boy + input.nextInt();
				gender = false;
				countB++;
			} else {
				girl = girl + input.nextInt();
				gender = true;
				countG++;
			}

		}
		System.out.println(countB + " boys, " + countG + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs((int) (girl - boy)));
	}

}
