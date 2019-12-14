package one;

//Write a complete Java program called Meta whose output is the text that would be the source code of a Java program named Hello
//that prints "Hello, world!" as its output:
//
//public class Hello {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//    }
//}
//Your program must produce exactly the output shown in order to pass (using exactly four spaces for each increment of indentation in
//the output).

public class Meta {
	public static void main(String[] args) {
		System.out.print(draw());
	}

	public static String draw() {
		String firstLine = "public class Hello { \n";
		String secondLine = "    public static void main(String[] args) { \n";
		String thirdLine = "        System.out.println(\"Hello, world!\"); \n";
		String fourthLine = "    } \n";
		String fifthLine = "}";
		return firstLine + secondLine + thirdLine + fourthLine + fifthLine;
	}

}