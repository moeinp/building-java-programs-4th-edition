package exercises;

/*
 * Write a method called cylinderSurfaceArea that accepts a radius and height (both real numbers) as parameters and returns the 
 * surface area of a cylinder with those dimensions. For example, the call cylinderSurfaceArea(3.0, 4.5) should return 
 * 141.3716694115407. The formula for the surface area of a cylinder with radius r and height h is the following:
 * 
 * surface area = 2πr^2 + 2πrh
 * */
public class CylinderSurfaceArea {

	public static void main(String[] args) {
		System.out.println(cylinderSurfaceArea(3.0, 4.5));
	}

	public static double cylinderSurfaceArea(double r, double h) {
		return (2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);
	}

}
