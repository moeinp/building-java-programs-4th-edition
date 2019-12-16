package exercises;

//Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
//
//  _______
// /       \
///         \
//\         /
// \_______/
//-"-'-"-'-"-
//  _______
// /       \
///         \
//\         /
// \_______/
//-"-'-"-'-"-
//\         /
// \_______/
//  _______
// /       \
///         \
//-"-'-"-'-"-
//\         /
// \_______/

public class Egg2 {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstImage = top() + bottom() + "\n" + middle();
		String secondImage = top() + bottom() + "\n" + middle() + bottom() + "\n";
		String thirdImage = top() + middle() + bottom();
		return firstImage + secondImage + thirdImage;
	}

	public static String top() {
		String firstLine = "  _______\n";
		String secondLine = " /       \\\n";
		String thirdLine = "/         \\\n";
		return firstLine + secondLine + thirdLine;
	}

	public static String middle() {
		return "-\"-'-\"-'-\"-\n";
	}

	public static String bottom() {
		String firstLine = "\\         /\n";
		String secondLine = " \\_______/";
		return firstLine + secondLine;
	}

}
