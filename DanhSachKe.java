package studyJavaPTIT;

import java.util.Scanner;
import java.util.Vector;

public class DanhSachKe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Vector<Vector<Integer>> data = new Vector<Vector<Integer>>();
		data.setSize(n + 1);

		for (int i = 1; i <= n; i++) {
			Vector<Integer> tmp = new Vector<Integer>();
			data.set(i, tmp);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if (x == 1) {
					data.get(i + 1).add(j + 1);
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("List(" + i + ") = ");
			for (int j : data.get(i)) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
