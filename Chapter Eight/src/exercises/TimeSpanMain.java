package exercises;

public class TimeSpanMain {
	public static void main(String[] args) {
		TimeSpan t1 = new TimeSpan(3,90);
		TimeSpan t2 = new TimeSpan(3,59);
		TimeSpan t3 = new TimeSpan(3,20);



		System.out.println(t1.getHours());
		System.out.println(t1.getMinutes());
		System.out.println(t1.toString());
		t1.scale(2);
		System.out.println(t1);
		t1.add(t2);
		System.out.println(t1);


	}
	
	
}
