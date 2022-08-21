package studyJavaPTIT;

import java.util.Scanner;

public class DienThoaiCucGach {
	public static boolean check(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] data = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			String ans = "";
			for (int j = 0; j < s.length(); j++) {
				outer: for (int i = 0; i < data.length; i++) {
					for (int k = 0; k < data[i].length(); k++) {
						if (Character.toLowerCase(data[i].charAt(k)) == Character.toLowerCase(s.charAt(j))) {
							ans += Integer.toString(i + 2);
							break outer;
						}
					}
				}
			}
			if (check(ans))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
