package exercises;

//Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy.

//
////////////////////////
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\
//|| Victory is mine! ||
//\\\\\\\\\\\\\\\\\\\\\\

public class Stewie2 {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {

		return top() + middle() + middle() + middle() + middle() + bottom();
	}

	public static String top() {
		return "//////////////////////\n";
	}

	public static String middle() {
		String firstLine = "|| Victory is mine! ||\n";
		String secondLine = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n";
		return firstLine + secondLine;
	}

	public static String bottom() {
		String firstLine = "|| Victory is mine! ||\n";
		String secondLine = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		return firstLine + secondLine;
	}

}
