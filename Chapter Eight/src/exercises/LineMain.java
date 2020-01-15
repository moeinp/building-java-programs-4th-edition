package exercises;

public class LineMain {
	public static void main(String[] args) {
		Point p1 = new Point(5, 2);
		Point p2 = new Point(7, -1);
		Line l1 = new Line(p1,p2);
		System.out.println(l1);
	}
}
