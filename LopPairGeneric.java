package studyJavaPTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<K, V> {
	private K fi;
	private V se;

	public Pair(K fi, V se) {
		super();
		this.fi = fi;
		this.se = se;
	}

	private boolean checkPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public boolean isPrime() {
		return checkPrime((Integer) fi) && checkPrime((Integer) se);
	}

	@Override
	public String toString() {
		return fi + " " + se;
	}

}

public class LopPairGeneric {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean check = false;
			for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
				Pair<Integer, Integer> p = new Pair<>(i, n - i);
				if (p.isPrime()) {
					System.out.println(p);
					check = true;
					break;
				}
			}
			if (!check)
				System.out.println(-1);
		}
	}

}
