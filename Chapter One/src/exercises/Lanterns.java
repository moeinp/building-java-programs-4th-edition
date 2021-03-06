package exercises;

//Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.
//
//In particular, make sure that main contains no System.out.println statements except for blank lines, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.
//
//    *****
//  *********
//*************
//
//    *****
//  *********
//*************
//* | | | | | *
//*************
//    *****
//  *********
//*************
//
//    *****
//  *********
//*************
//    *****
//* | | | | | *
//* | | | | | *
//    *****
//    *****

public class Lanterns {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstEllement = top() + "\n";
		String secondEllement = top() + middle() + top() + "\n";
		String thirdEllement = top() + end();
		return firstEllement + secondEllement + thirdEllement;
	}

	public static String top() {
		String firstLine = "    *****\n";
		String secondLine = "  *********\n";
		String thirdLine = "*************\n";
		return firstLine + secondLine + thirdLine;
	}

	public static String middle() {
		String firstLine = "* | | | | | *\n";
		String secondLine = "*************\n";
		return firstLine + secondLine;
	}

	public static String end() {
		String firstLine = "    *****\n";
		String secondLine = "* | | | | | *\n";
		String thirdLine = "* | | | | | *\n";
		String fourthLine = "    *****\n";
		String fifthLine = "    *****";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine;
	}
}
