package studyJavaPTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.multiply(b).divide(a.gcd(b)));
		}
	}
}
