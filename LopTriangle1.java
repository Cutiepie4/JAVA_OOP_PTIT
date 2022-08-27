package studyJavaPTIT;

import java.util.Scanner;

class Point {
	private double x, y;

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(Point a) {
		super();
		this.x = a.getX();
		this.y = a.getY();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static Point nextPoint(Scanner sc) {
		Point a = new Point(sc.nextDouble(), sc.nextDouble());
		return a;
	}

}

class Triangle {
	private Point a = new Point(0, 0), b = new Point(0, 0), c = new Point(0, 0);

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = new Point(a);
		this.b = new Point(b);
		this.c = new Point(c);
	}

	public static double getDistance(Point a, Point b) {
		return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	}

	public boolean valid() {
		if ((getDistance(a, b) + getDistance(a, c) <= getDistance(b, c)
				|| (getDistance(c, b) + getDistance(a, c) <= getDistance(b, a))
				|| (getDistance(a, b) + getDistance(b, c) <= getDistance(a, c)))) {
			return false;
		}
		return true;
	}

	public String getPerimeter() {
		return String.format("%.3f", getDistance(a, b) + getDistance(b, c) + getDistance(a, c));
	}

}

public class LopTriangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
			if (!a.valid()) {
				System.out.println("INVALID");
			} else {
				System.out.println(a.getPerimeter());
			}
		}
	}
}
