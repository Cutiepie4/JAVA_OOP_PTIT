package studyJavaPTIT;

import java.util.Scanner;

public class HopCuaHaiDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenA = sc.nextInt(), lenB = sc.nextInt();
		int[] mark = new int[1001];

		for (int i = 0; i < lenA + lenB; i++) {
			mark[sc.nextInt()]++;
		}

		for (int i = 0; i < 1001; i++) {
			if (mark[i] > 0)
				System.out.print(i + " ");
		}
	}
}
