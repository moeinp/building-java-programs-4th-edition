package exercises;

//Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
//
//*****
//*****
// * *
//  *
// * *
//
//*****
//*****
// * *
//  *
// * *
//*****
//*****
//
//  *
//  *
//  *
//*****
//*****
// * *
//  *
// * *

public class StarFigures {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstEllement = tenStar() + fiveStar() + "\n";
		String secondEllement = tenStar() + fiveStar() + tenStar() + "\n";
		String fourthEllement = threeStar() + tenStar() + fiveStar();
		return firstEllement + secondEllement + fourthEllement;
	}

	public static String tenStar() {
		String firstLine = "*****\n";
		String secondLine = "*****\n";
		return firstLine + secondLine;
	}

	public static String fiveStar() {
		String firstLine = " * *\n";
		String secondLine = "  *\n";
		String thirdLine = " * *\n";
		return firstLine + secondLine + thirdLine;
	}

	public static String threeStar() {
		String firstLine = "  *\n";
		String secondLine = "  *\n";
		String thirdLine = "  *\n";
		return firstLine + secondLine + thirdLine;
	}
}
