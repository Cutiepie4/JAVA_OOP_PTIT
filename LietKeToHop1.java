package studyJavaPTIT;

import java.util.Scanner;

public class LietKeToHop1 {
	public static int cnt = 0;

	public static void nextCombination(int[] a, int k, int n) {
		for (int i = 1; i <= k; i++) {
			System.out.print(a[i] + " ");
		}
		cnt++;
		System.out.println();

		for (int i = k; i > 0; i--) {
			if (a[i] < n - k + i) {
				a[i]++;
				for (int j = i + 1; j <= k; j++) {
					a[j] = a[i] + j - i;
				}
				nextCombination(a, k, n);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		int[] a = new int[k + 1];
		for (int i = 1; i <= k; i++) {
			a[i] = i;
		}
		nextCombination(a, k, n);
		System.out.println("Tong cong co " + cnt + " to hop");
	}
}
