package exercises;

public class Line {
	private Point p1;
	private Point p2;

	public Line(Point one, Point two) {
		this.p1 = one;
		this.p2 = two;
	}

	public Line(int x1, int y1, int x2, int y2) {

		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);

	}

	public Point getp1() {
		return p1;
	}

	public Point getp2() {
		return p2;
	}

	public String toString() {
		return "[(" + p1.getX() + "," + p1.getY() + "),(" + p2.getX() + "," + p2.getY() + ")]";
	}

	public double getSlope() {

		if (p1.getX() == p2.getX()) {
			throw new IllegalStateException();
		}
		double rise = p2.getY() - p1.getY();
		double run = p2.getX() - p1.getX();
		return rise / run;
	}

	public boolean isCollinear(Point p) {
		return false;
	}

}
