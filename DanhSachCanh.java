package studyJavaPTIT;

import java.util.Scanner;
import java.util.Vector;

public class DanhSachCanh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Vector<Vector<Integer>> data = new Vector<Vector<Integer>>();
		data.setSize(n + 1);

//		data.setSize(n + 1);
		for (int i = 1; i <= n; i++) {
			Vector<Integer> tmp = new Vector<Integer>();
			data.set(i, tmp);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if (x == 1) {
					data.elementAt(i + 1).add(j + 1);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (data.get(i + 1).size() > 0) {
				for (int j : data.elementAt(i + 1)) {
					if (j > i)
						System.out.println("(" + (i + 1) + "," + j + ")");
				}
			}
		}

	}
}
