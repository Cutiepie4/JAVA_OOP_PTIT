package studyJavaPTIT;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class DayConLienTiepCoTongBangK {
	static Scanner sc = new Scanner(System.in);

	public static void solution() {

		long n = sc.nextLong(), sum = sc.nextLong();
		Vector<Long> vt = new Vector<Long>();
		vt.add((long) 0);
		for (int i = 1; i <= n; i++) {
			vt.add(sc.nextLong());
		}

		for (int i = 1; i <= n; i++) {
			if (vt.get(i) == sum) {
				System.out.println("YES");
				return;
			}
			vt.set(i, vt.get(i) + vt.get(i - 1));
		}
		for (int i = 0; i <= n; i++) {
			long tmp = vt.get(i) + sum;
			if (Collections.binarySearch(vt.subList(i + 1, vt.size()), tmp) >= 0) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			solution();
		}
	}
}
