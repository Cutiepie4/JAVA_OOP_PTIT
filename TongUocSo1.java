package studyJavaPTIT;

import java.util.Scanner;

public class TongUocSo1 {
	public static int MAX = (int) Math.pow(10, 6) * 2;
	public static int[] check = new int[MAX + 1];

	public static void initErathos() {
		for (int i = 2; i * i <= MAX; i++) {
			if (check[i] == 0) {
				for (int j = i; j <= MAX; j += i) {
					if (check[j] == 0)
						check[j] = i;
				}
			}
		}
		for (int i = 2; i <= MAX; i++) {
			if (check[i] == 0)
				check[i] = i;
		}
	}

	public static int SUM(int a) {
		int ans = 0;
		while (a != 1) {
			ans += check[a];
			a /= check[a];
		}
		return ans;
	}

	public static void main(String[] args) {
		initErathos();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		while (n-- > 0) {
			int x = sc.nextInt();
			if (check[x] != 0)
				sum += SUM(x);
			else
				sum += x;
		}
		System.out.println(sum);
		sc.close();
	}
}
