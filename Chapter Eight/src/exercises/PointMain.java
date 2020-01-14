package exercises;

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point(1, -2);
		System.out.println("p1 " + p1 + " is in quadrant " + p1.quadrant());
		System.out.println();

		System.out.print(p1 + " fliped is ");
		p1.flip();
		System.out.println(p1);
		System.out.println();

		Point a = new Point(1, 2);
		Point b = new Point(1, -2);
		System.out.println("the manhattanDistance between a " + a + " and b " + b + "is " + a.manhattanDistance(b));
		System.out.println();

		System.out.println("a "+a +" is vertical to " + " b "+b +" a.isVertical(b): "+ a.isVertical(b));
		System.out.println();
		
		Point x = new Point(1,2);
		Point y = new Point(3,0);
		System.out.println("the slope between x "+x +" and " + " y "+y +" is "+ x.slope(y));
		System.out.println();
		

		
		
	}
	
}
