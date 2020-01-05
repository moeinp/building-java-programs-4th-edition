package exercise;

import java.util.Scanner;

/*
 * Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the user to enter 
 * one or more words and prints whether the entered String is a palindrome (i.e., reads the same forwards as it does backwards, 
 * like "abba" or "racecar"). If the following Scanner object were declared:
 * 
 * Scanner console = new Scanner(System.in);
 * printPalindrome(console);
 * The resulting output for a call where the user types a palindrome would be:
 * 
 * Type one or more words: racecar
 * racecar is a palindrome!
 * The output for a call where the user types a word that is not a palindrome would be:
 * 
 * Type one or more words: hello
 * hello is not a palindrome
 * 
 * For an added challenge, make the code case-insensitive, so that words like "Abba" and "Madam" will be considered palindromes.*/
public class PrintPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printPalindrome(in);
	}

	public static void printPalindrome(Scanner in) {
		System.out.print("Type one or more words: ");
		String phrase = in.nextLine();
		int length = phrase.length() / 2;
		boolean pal = true;
		int endPointer = phrase.length() - 1;
		for (int i = 0; i < length; i++) {
			if (phrase.toLowerCase().charAt(i) != phrase.toLowerCase().charAt(endPointer--)) {
				pal = false;
			}
		}
		if (pal == true) {
			System.out.println(phrase + " is a palindrome!");
		} else {
			System.out.println(phrase + " is not a palindrome.");

		}
	}
}
