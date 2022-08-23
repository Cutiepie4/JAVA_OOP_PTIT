package studyJavaPTIT;

import java.util.Scanner;

public class UocChungLonNhatCuaDaySo {
	public static int ucln(int a, int b) {
		if (b == 0)
			return a;
		return ucln(b, a % b);
	}

	public static int bcnn(int a, int b) {
		return a * b / ucln(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = new int[n + 1];
			for (int i = 0; i < n - 1; i++) {
				b[i + 1] = bcnn(a[i], a[i + 1]);
			}

			for (int i = 1; i <= b[1]; i++) {
				if (ucln(i, b[1]) == a[0]) {
					b[0] = i;
					break;
				}
			}
			for (int i = 1; i <= b[n - 1]; i++) {
				if (ucln(i, b[n - 1]) == a[n - 1]) {
					b[n] = i;
					break;
				}
			}

			for (int i = 0; i < n + 1; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
	}
}
