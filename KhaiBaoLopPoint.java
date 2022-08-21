package studyJavaPTIT;

import java.util.Scanner;

class Point {
	private double x, y;

	public Point() {

	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point a) {
		this.x = a.getX();
		this.y = a.getY();
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(Point a) {
		return Math.sqrt((this.x - a.getX()) * (this.x - a.getX()) + (this.y - a.getY()) * (this.y - a.getY()));
	}

	public static double distance(Point a, Point b) {
		return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

public class KhaiBaoLopPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			Point a = new Point(sc.nextDouble(), sc.nextDouble());
			Point b = new Point(sc.nextDouble(), sc.nextDouble());
			System.out.printf("%.4f", Point.distance(a, b));
			System.out.println();
		}

	}

}