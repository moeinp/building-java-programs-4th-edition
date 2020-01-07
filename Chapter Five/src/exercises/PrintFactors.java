package exercises;

public class PrintFactors {

	public static void main(String[] args) {
		printFactors(6);
	}

	public static void printFactors(int num) {
		for (int i = 1; i < num; i++) {
			if((num % i) == 0) {
				System.out.print(i + " and ");
			}
		}
		System.out.println(num);
	}
}
