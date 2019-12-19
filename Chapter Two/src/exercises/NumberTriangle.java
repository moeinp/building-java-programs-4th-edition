package exercises;

/**
 * Write for loops to produce the following output:
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 */
public class NumberTriangle {

	public static void main(String[] args) {
		System.out.println(nmbrTrngl());
	}
	
	public static String nmbrTrngl(){
		String ans = "";
		int k = 0;
		for (int i = 1; i <= 7; i++) {
			k = k + 1;
			for (int j = 0; j < k; j++) {
				ans = ans + i;
			}
			ans = ans + "\n";
		}
		return ans;
	}

}
