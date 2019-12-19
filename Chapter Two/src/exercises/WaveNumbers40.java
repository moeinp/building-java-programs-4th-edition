package exercises;

/**
 * Write for loops to produce the following output, with each line 40 characters
 * wide:
 * 
 * ----------------------------------------
 * _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
 * 1122334455667788990011223344556677889900
 * ----------------------------------------
 */
public class WaveNumbers40 {


	public static void main(String[] args) {
		System.out.println(waveMaker());
	}
	
	public static String waveMaker() {
		String ans = "";
		for (int i = 0; i < 40; i++) {
			ans = ans + "-";
		}
		ans = ans + "\n";
		for (int i = 0; i < 10; i++) {
			ans = ans + "_-^-";
		}
		ans = ans + "\n";
		for (int i = 1; i < 21; i++) {
			ans = ans + (i % 10) + (i % 10);
		}
		ans = ans + "\n";
		for (int i = 0; i < 40; i++) {
			ans = ans + "-";
		}
		return ans;
	}

}
