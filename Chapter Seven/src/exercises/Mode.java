package exercises;

public class Mode {

	public static void main(String[] args) {
		System.out.println(mode(new int[] {27, 15, 15, 11, 27}));
	}

	public static int mode(int arr[]) {
		int temp[] = new int[101];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]++;
		}
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] > max) {
				max = temp[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
