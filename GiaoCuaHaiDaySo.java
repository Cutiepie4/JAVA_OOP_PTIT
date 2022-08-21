package studyJavaPTIT;

import java.util.Scanner;

public class GiaoCuaHaiDaySo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenA = sc.nextInt(), lenB = sc.nextInt();
		int[] mark = new int[1001];

		for (int i = 0; i < lenA; i++) {
			mark[sc.nextInt()]++;
		}

		for (int i = 0; i < lenB; i++) {
			int x = sc.nextInt();
			if (mark[x] > 0)
				mark[x] = -1;
		}

		for (int i = 0; i < 1001; i++) {
			if (mark[i] == -1)
				System.out.print(i + " ");
		}
	}
}