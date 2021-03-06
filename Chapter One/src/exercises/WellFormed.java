package exercises;

//Write a complete Java program in a class named WellFormed that prints the following output:
//
//A well-formed Java program has
//a main method with { and }
//braces.
//
//A System.out.println statement
//has ( and ) and usually a
//String that starts and ends
//with a " character.
//(But we type \" instead!)

public class WellFormed {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "A well-formed Java program has\n";
		String secondLine = "a main method with { and }\n";
		String thirdLine = "braces.\n";
		String fourthLine = "\n";
		String fifthLine = "A System.out.println statement\n";
		String sixthLine = "has ( and ) and usually a\n";
		String seventhLine = "String that starts and ends\n";
		String eightLine = "with a \" character.\n";
		String ninthLine = "(But we type \\\" instead!)\n";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine + seventhLine + eightLine
				+ ninthLine;
	}

}
