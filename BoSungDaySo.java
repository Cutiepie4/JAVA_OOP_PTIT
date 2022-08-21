package studyJavaPTIT;

import java.util.Scanner;

public class BoSungDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 1;
		int max = 0;
		int[] arr = new int[201];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			max = Math.max(max, x);
			arr[x]++;
		}
		boolean ok = true;
		for (int i = 1; i < max; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
				ok = false;
			}
				
		}
		if(ok) System.out.println("Excellent!");

	}
}
