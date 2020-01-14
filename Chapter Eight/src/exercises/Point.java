package exercises;

public class Point {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int xNum, int yNum) {
		setLocation(xNum, yNum);
	}

	public void setLocation(int xNum, int yNum) {
		x = xNum;
		y = yNum;
	}

	public double distanceFromOrigin() {
		return Math.sqrt((x * x) + (y * y));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public void translate(int xVal, int yVal) {
		x += xVal;
		y += yVal;
	}

	public int quadrant() {
		if (x == 0 || y == 0) {
			return 0;
		} else if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else {
			return 4;
		}
	}

	public void flip() {
		int temp = y;
		y = -x;
		x = -temp;
	}

	public int manhattanDistance(Point other) {

		return Math.abs(x - other.getX()) + Math.abs(y - other.getY());
	}

	public boolean isVertical(Point other) {
		if ((x == other.x && y != other.y) || (x == other.x && y == other.y)) {
			return true;
		} else {
			return false;
		}
	}

	public double slope(Point other) {
		if (x == other.x) {
			throw new IllegalArgumentException();
		}
		double rise = y - other.y;
		double run = x - other.x;
		return rise / run;
	}

	public boolean isCollinear(Point p1, Point p2) {
		if (p1.x == p2.x && p1.y == p2.y && p2.x == x && p2.y == y) {
			return true;
		} else {
			return slope(p1) == slope(p2);

		}

	}

}