package studyJavaPTIT;

import java.util.Scanner;

public class TinhLuyThua {
	public static long MOD = (long) Math.pow(10, 9) + 7;

	public static long sqr(long x) {
		return x * x;
	}

	public static long power(long n, long k) {
		if (k == 1)
			return n;
		if (k % 2 == 0)
			return sqr(power(n, k / 2)) % MOD;
		return sqr(power(n, k / 2)) % MOD * n % MOD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b;
		while (true) {
			a = sc.nextLong();
			b = sc.nextLong();
			if (a == b && a == 0)
				return;
			if (b == 0)
				System.out.println(1);
			else
				System.out.println(power(a, b));
		}
	}

}
