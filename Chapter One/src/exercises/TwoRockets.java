package exercises;

//Write a complete Java program in a class named TwoRockets that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
//
//Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?
//
//   /\       /\
//  /  \     /  \
// /    \   /    \
//+------+ +------+
//|      | |      |
//|      | |      |
//+------+ +------+
//|United| |United|
//|States| |States|
//+------+ +------+
//|      | |      |
//|      | |      |
//+------+ +------+
//   /\       /\
//  /  \     /  \
// /    \   /    \

public class TwoRockets {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = point();
		String secondLine = box();
		String thirdLine = us();
		String fourthLine = box();
		String fifthLine = point();
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine;
	}

	public static String point() {
		String firstLine = "   /\\       /\\\n";
		String secondLine = "  /  \\     /  \\\n";
		String thirdLine = " /    \\   /    \\\n";
		return firstLine + secondLine + thirdLine;
	}

	public static String box() {
		String firstLine = "+------+ +------+\n";
		String secondLine = "|      | |      |\n";
		String thirdLine = "|      | |      |\n";
		String fourthLine = "+------+ +------+\n";
		return firstLine + secondLine + thirdLine + fourthLine;
	}

	public static String us() {
		String firstLine = "|United| |United|\n";
		String secondLine = "|States| |States|\n";
		return firstLine + secondLine;
	}

}
