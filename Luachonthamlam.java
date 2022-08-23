package studyJavaPTIT;

import java.util.Scanner;

public class Luachonthamlam {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt(), s = x.nextInt(), ok = 0;
		int snn = s - 1;
		int[] a = new int[1005];
		int[] b = new int[1005];
		if (n == 1 && s == 0) {
			System.out.println("0 0");
			ok = 1;
		}
		if (s == 0 && n > 1 || s > 9 * n) {
			System.out.println("-1 -1");
			ok = 1;
		}
		if (ok == 0) {
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 9; j > 0; j--) {
					if (snn - j >= 0) {
						a[i] = j;
						snn -= j;
						break;
					}
				}
				if (a[i] == 0)
					break;
			}
			a[0] = a[0] + 1;
			for (int i = 0; i < n; i++) {
				for (int j = 9; j > 0; j--) {
					if (s - j >= 0) {
						b[i] = j;
						s -= j;
						break;
					}
				}
				if (b[i] == 0)
					break;
			}
			for (int i = 0; i < n; i++)
				System.out.print(a[i]);
			System.out.print(" ");
			for (int i = 0; i < n; i++)
				System.out.print(b[i]);
			System.out.println();
		}
	}
}