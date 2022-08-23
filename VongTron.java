package studyJavaPTIT;

import java.util.Scanner;

public class VongTron {
	public static int count(String s, int i, int j) {
		int cnt = 0;
		for (int z = i + 1; z < j; z++) {
			for (int t = 0; t < i; t++) {
				if (s.charAt(z) == s.charAt(t)) {
					cnt++;
					break;
				}
			}
			for (int t = j + 1; t < s.length(); t++) {
				if (s.charAt(z) == s.charAt(t)) {
					cnt++;
					break;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					sum += count(s, i, j);
					break;
				}
			}
		}
		System.out.println(sum / 2);
	}
}
