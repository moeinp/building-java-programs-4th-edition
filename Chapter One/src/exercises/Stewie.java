package exercises;

//Write a complete Java program in a class named Stewie that prints the following output:
//
////////////////////////
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\

public class Stewie {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "//////////////////////\n";
		String secondLine = "|| Victory is mine! ||\n";
		String thirdLine = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		return firstLine + secondLine + thirdLine;
	}
}
