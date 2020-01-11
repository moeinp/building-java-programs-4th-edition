package exercises;

public class Collapse {

	public static void main(String[] args) {

	}
	public static int[] collapse(int arr[]) {
		int[] ans;
		if(arr.length % 2 ==1 ) {
			ans = new int[arr.length/2 + 1];
			ans[ans.length-1] = arr[arr.length-1];
			int index = 0;
			for (int i = 0; i < arr.length-1; i++) {
				ans[index]=arr[i]+arr[i+1];
				i++;
				index++;
			}
		}else {
			ans = new int[arr.length/2];
			int index = 0;
			for (int i = 0; i < arr.length; i++) {
				ans[index]=arr[i]+arr[i+1];
				i++;
				index++;
			}
		}
		return ans;
		
	}

}
