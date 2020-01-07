package exercises;

public class ToBinary {

	public static void main(String[] args) {
		System.out.println(toBinary(42));
	}

	public static String toBinary(int num) {
		if(num == 0) {
			return "0";
		}
		String ans = "";
		while (num > 0) {
			ans = (num % 2) + ans;
			num /= 2;
		}
		return ans;
	}
}
