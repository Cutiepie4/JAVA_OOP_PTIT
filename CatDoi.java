package studyJavaPTIT;

import java.util.Scanner;

public class CatDoi {
	public static char split(char c) {
		if (c == '9' || c == '8' || c == '0')
			return '0';
		if (c == '1')
			return '1';
		return '@';
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			boolean ok = true;
			for (int i = 0; i < s.length(); i++) {
				sb.setCharAt(i, split(s.charAt(i)));
				if (sb.charAt(i) == '@') {
					ok = false;
					break;
				}
			}
			while (sb.length() > 0 && sb.charAt(0) == '0')
				sb.deleteCharAt(0);
			if (ok && sb.length() > 0) {
				System.out.println(sb);
			} else
				System.out.println("INVALID");
		}

		sc.close();
	}
}
