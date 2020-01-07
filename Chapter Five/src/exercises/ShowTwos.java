package exercises;

public class ShowTwos {

	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
	}

	public static void showTwos(int num) {
		String ans = num + " = ";
		while ((num % 2) == 0) {
			ans = ans + "2 * ";
			num = num / 2;
		}
		ans = ans + num;
		System.out.println(ans);

	}
}
