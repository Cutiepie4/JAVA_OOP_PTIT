package studyJavaPTIT;

import java.util.Scanner;

class Point {
	private double x, y;

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

	public double distance(Point a) {
		return Math.sqrt((this.x - a.getX()) * (this.x - a.getX()) + (this.y - a.getY()) * (this.y - a.getY()));
	}

	public static double square(double a, double b, double c) {
		double ans = (a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c);
		ans = Math.sqrt(ans);
		return ans / 4;
	}

}

public class DienTichHinhTronNgoaiTiepTamGiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Point a = new Point(sc.nextDouble(), sc.nextDouble());
			Point b = new Point(sc.nextDouble(), sc.nextDouble());
			Point c = new Point(sc.nextDouble(), sc.nextDouble());
			double ab = a.distance(b);
			double bc = b.distance(c);
			double ca = c.distance(a);
			if (ab + bc <= ca || ab + ca <= bc || bc + ca <= ab) {
				System.out.println("INVALID");
			} else {
				double S = Point.square(ab, bc, ca);
				double R = ab * bc * ca / 4 / S;
				System.out.println(String.format("%.3f", Math.PI * R * R));
			}

		}
	}
}
