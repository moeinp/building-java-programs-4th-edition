package exercises;

//Write a complete Java program in a class named Difference that prints the following output:
//
//What is the difference between
//a ' and a "?  Or between a " and a \"?
//
//One is what we see when we're typing our program.
//The other is what appears on the "console."

public class Difference {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "What is the difference between\n";
		String secondLine = "a ' and a \"?  Or between a \" and a \\\"?\n";
		String thirdLine = "\n";
		String fourthLine = "One is what we see when we're typing our program.\n";
		String fifthLine = "The other is what appears on the \"console.\"";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine;
	}

}
