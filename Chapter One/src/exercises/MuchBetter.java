package exercises;

//Write a complete Java program in a class named MuchBetter that prints the following output:
//
//A "quoted" String is
//'much' better if you learn
//the rules of "escape sequences."
//Also, "" represents an empty String.
//Don't forget: use \" instead of " !
//'' is not the same as "

public class MuchBetter {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "A \"quoted\" String is\n";
		String secondLine = "'much' better if you learn\n";
		String thirdLine = "the rules of \"escape sequences.\"\n";
		String fourthLine = "Also, \"\" represents an empty String.\n";
		String fifthLine = "Don't forget: use \\\" instead of \" !\n";
		String sixthLine = "'' is not the same as \"";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine;
	}

}
