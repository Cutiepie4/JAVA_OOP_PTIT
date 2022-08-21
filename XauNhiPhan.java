package studyJavaPTIT;

import java.util.Scanner;

public class XauNhiPhan {
	public static long[] fb = new long[93];

	public static void initFibo() {
		fb[1] = 1;
		fb[2] = 1;
		for (int i = 3; i < 93; i++) {
			fb[i] = fb[i - 1] + fb[i - 2];
		}
	}

	public static char find(int n, long k) {
		if (k == 1 && n == 1)
			return '0';
		if (k == 1 && n == 2)
			return '1';
		if (k > fb[n - 2])
			return find(n - 1, k - fb[n - 2]);
		return find(n - 2, k);
	}

	public static void main(String[] args) {
		initFibo();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			System.out.println(find(n, k));
		}
	}
}
