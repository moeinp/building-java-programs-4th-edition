package exercises;

/*
 * Write a method padString that accepts two parameters: a String and an integer representing a length. The method should pad the 
 * parameter string with spaces until its length is the given length. For example, padString("hello", 8) should return "   hello". 
 * (This sort of method is useful when trying to print output that lines up horizontally.) If the string's length is already at least as 
 * long as the length parameter, your method should return the original string. For example, padString("congratulations", 10) would 
 * return "congratulations".
 * 
*/
public class PadString {
	public static void main(String[] args) {
		System.out.println(padString("hello", 8));
	}

	public static String padString(String word, int pad) {
		int spaceSize = pad - word.length();
		if (pad < spaceSize) {
			return word;
		}
		for (int i = 0; i < spaceSize; i++) {
			word = " " + word;
		}
		return word;
	}
}
