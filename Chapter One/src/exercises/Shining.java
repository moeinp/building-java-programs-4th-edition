package exercises;

//Write a program in a class named Shining that prints the following line of output 1000 times:
//
//All work and no play makes Jack a dull boy.
//You should not write a program whose source code is 1000 lines long; use methods to shorten the program. What is the shortest 
//program you can write that will produce the 1000 lines of output, using only the material from Chapter 1 (println, methods, etc.)?

public class Shining {
	public static void main(String[] args) {
		System.out.print(drawXTenXTen());

	}

	public static String draw() {
		String firstLine = "All work and no play makes Jack a dull boy.\n";
		String secondLine = "All work and no play makes Jack a dull boy.\n";
		String thirdLine = "All work and no play makes Jack a dull boy.\n";
		String fourthLine = "All work and no play makes Jack a dull boy.\n";
		String fifthLine = "All work and no play makes Jack a dull boy.\n";
		String sixthLine = "All work and no play makes Jack a dull boy.\n";
		String seventhLine = "All work and no play makes Jack a dull boy.\n";
		String eightLine = "All work and no play makes Jack a dull boy.\n";
		String ninthLine = "All work and no play makes Jack a dull boy.\n";
		String tenthLine = "All work and no play makes Jack a dull boy.\n";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine + seventhLine + eightLine
				+ ninthLine + tenthLine;
	}

	public static String drawXTen() {
		String firstLine = draw();
		String secondLine = draw();
		String thirdLine = draw();
		String fourthLine = draw();
		String fifthLine = draw();
		String sixthLine = draw();
		String seventhLine = draw();
		String eightLine = draw();
		String ninthLine = draw();
		String tenthLine = draw();
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine + seventhLine + eightLine
				+ ninthLine + tenthLine;
	}

	public static String drawXTenXTen() {
		String firstLine = drawXTen();
		String secondLine = drawXTen();
		String thirdLine = drawXTen();
		String fourthLine = drawXTen();
		String fifthLine = drawXTen();
		String sixthLine = drawXTen();
		String seventhLine = drawXTen();
		String eightLine = drawXTen();
		String ninthLine = drawXTen();
		String tenthLine = drawXTen();
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine + seventhLine + eightLine
				+ ninthLine + tenthLine;
	}
}
