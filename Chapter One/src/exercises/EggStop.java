package exercises;

//Write a complete Java program in a class named EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
//
//  ______
// /      \
///        \
//\        /
// \______/
//
//  ______
// /      \
///        \
//\        /
// \______/
//+--------+
//
//  ______
// /      \
///        \
//|  STOP  |
//\        /
// \______/
//+--------+

public class EggStop {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstImage = top() + bottom() + "\n";
		String secondImage = top() + bottom() + line() + "\n\n";
		String thirdImage = top() + stop() + bottom() + line();
		return firstImage + secondImage + thirdImage;
	}

	public static String top() {
		String firstLine = "  ______\n";
		String secondLine = " /      \\\n";
		String thirdLine = "/        \\\n";
		return firstLine + secondLine + thirdLine;
	}

	public static String stop() {
		return "|  STOP  |\n";
	}

	public static String line() {
		return "+--------+";
	}

	public static String bottom() {
		String firstLine = "\\        /\n";
		String secondLine = " \\______/\n";
		return firstLine + secondLine;
	}

}
