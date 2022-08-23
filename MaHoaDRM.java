package studyJavaPTIT;

import java.util.Scanner;

public class MaHoaDRM {

	public static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static int sum(String s) {
		int ans = 0;
		for (char i : s.toCharArray()) {
			ans += i;
		}
		return ans;
	}

	public static String rotate(String s, int k) {
		k %= 26;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			sb.setCharAt(i, ABC.charAt((ABC.indexOf(s.charAt(i)) + k) % 26));
		}
		return sb.toString();
	}

	public static String merge(String a, String b) {
		StringBuilder sb = new StringBuilder(a);
		for (int i = 0; i < a.length(); i++) {
			sb.setCharAt(i, ABC.charAt(((ABC.indexOf(a.charAt(i)) + ABC.indexOf(b.charAt(i)))) % 26));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String s1 = s.substring(0, s.length() / 2), s2 = s.substring(s.length() / 2);
			s1 = rotate(s1, sum(s1));
			s2 = rotate(s2, sum(s2));
			System.out.println(merge(s1, s2));
		}
	}
}
