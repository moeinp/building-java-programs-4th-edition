package exercises;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		if (width < 0 || height < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, int width, int height) {
		this(p.getX(), p.getY(), width, height);
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}

	public boolean contains(int x, int y) {

		if (x >= this.x && y >= this.y && x <= this.x + this.width && y <= this.y + this.height) {
			return true;
		}

		return false;

	}

	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}

}
