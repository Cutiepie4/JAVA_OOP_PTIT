package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepMaTran {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATRIX.in"));

		int t = sc.nextInt();
		while (t-- > 0) {
			int r = sc.nextInt(), c = sc.nextInt(), k = sc.nextInt();

			int[][] m = new int[r][c];

			ArrayList<Integer> v = new ArrayList<Integer>();

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					m[i][j] = sc.nextInt();
					if (j == k - 1) {
						v.add(m[i][j]);
					}
				}
			}

			Collections.sort(v);

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (j == k - 1) {
						System.out.print(v.get(0) + " ");
						v.remove(0);
					} else
						System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}