
package exercises;

/**
 * Write a for loop that produces the following output:
 * 
 * 1 4 9 16 25 36 49 64 81 100
 * 
 * For added challenge, try to modify your code so that it does not need to use
 * the * multiplication operator. (It can be done! Hint: Look at the differences
 * between adjacent numbers.)
 */
public class LoopSquares {

	public static void main(String[] args) {
		System.out.println(rookie());
		System.out.println(pro());

	}

	public static String rookie() {
		String squares = "";
		for (int i = 1; i <= 10; i++) {
			squares = squares + i * i + " ";
		}
		return squares;
	}

	public static String pro() {
		int j = 1;
		String squares = "";
		for (int i = 1; i <= 100; i += j) {
			squares = squares + i + " ";
			j = j + 2;
		}
		return squares;
	}

}
