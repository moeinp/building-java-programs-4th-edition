package exercise;

/*
 * Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice. 
 * For example, stutter("Hello!") returns "HHeelllloo!!"
*/public class Stutter {
	public static void main(String[] args) {
		System.out.println(stutter("hello"));
	}
	public static String stutter(String word) {
		String ans = "";
		for (int i = 0; i < word.length(); i++) {
			ans = ans + word.charAt(i) + word.charAt(i);
		}
		return ans;
	}
}
