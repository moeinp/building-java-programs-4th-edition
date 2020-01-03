package exercises;

/*
 * Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is 
 * printed about their first, then last, name. Use a method to avoid redundancy.
 * 
 * What is your name? Fifty Cent
 * Fifty Fifty, bo-Bifty
 * Banana-fana fo-Fifty
 * Fee-fi-mo-Mifty
 * FIFTY!
 * 
 * Cent Cent, bo-Bent
 * Banana-fana fo-Fent
 * Fee-fi-mo-Ment
 * CENT!
 * */

import java.util.Scanner;

public class TheNameGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(song(in));

	}

	public static String song(Scanner in) {
		System.out.print("What is your name? ");
		String first = in.next();
		String last = in.next();
		return part(first) + "\n\n" + part(last);

	}

	public static String part(String name) {
		String lastLetters = name.substring(1, name.length());
		String caps = name.toUpperCase();
		String song = name + " " + name + ", bo-B" + lastLetters + "\n";
		song = song + "Banana-fana fo-F" + lastLetters + "\n";
		song = song + "Fee-fi-mo-M" + lastLetters + "\n";
		song = song + caps + "!";
		return song;
	}

}
