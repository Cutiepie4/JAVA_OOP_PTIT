package studyJavaPTIT;

import java.util.Scanner;

class Point3D {
	private int x, y, z;

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
		int e1 = b.x - a.x;
		int e2 = b.y - a.y;
		int e3 = b.z - a.z;
		int f1 = c.x - a.x;
		int f2 = c.y - a.y;
		int f3 = c.z - a.z;
		int g1 = d.x - a.x;
		int g2 = d.y - a.y;
		int g3 = d.z - a.z;
		int o = e2 * f3 - e3 * f2;
		int p = e3 * f1 - e1 * f3;
		int q = e1 * f2 - e2 * f1;
		if (g1 * o + g2 * p + g3 * q == 0)
			return true;
		return false;
	}
}

public class BonDiemTrenMatPhang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
			Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
			Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
			Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

			if (Point3D.check(p1, p2, p3, p4)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}