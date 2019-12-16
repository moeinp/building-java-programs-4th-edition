package exercises;

//Write a complete Java program in a class named Spikey that prints the following output:
//
//	  \/
//	 \\//
//	\\\///
//	///\\\
//	 //\\
//	  /\

public class Spikey {

	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "  \\/\n";
		String secondLine = " \\\\//\n";
		String thirdLine = "\\\\\\///\n";
		String fourthLine = "///\\\\\\\n";
		String fifthLine = " //\\\\\n";
		String sixthLine = "  /\\";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine;
	}

}
