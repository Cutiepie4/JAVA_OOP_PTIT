package studyJavaPTIT;

import java.util.Scanner;

public class TichMaTranVoiChuyenVi {
	public static int[][] chuyenVi(int[][] mt, int r, int c) {
		int[][] temp = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				temp[i][j] = mt[j][i];
			}
		}
		return temp;
	}

	public static void mul(int[][] A, int[][] B, int r, int c) {
		int[][] C = new int[r][r];

		for (int i = 0; i < r; i++) {
			for (int k = 0; k < r; k++) {
				C[i][k] = 0;
				for (int j = 0; j < c; j++) {
					C[i][k] += A[i][j] * B[j][k];
				}
			}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int test = 1;
		while (t-- > 0) {
			System.out.println("Test " + test++ + ":");
			int n = sc.nextInt(), m = sc.nextInt();

			int[][] mt = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					mt[i][j] = sc.nextInt();
				}
			}

			int[][] mt1 = mt;
			mt1 = chuyenVi(mt1, n, m);
			mul(mt, mt1, n, m);
		}
	}
}
