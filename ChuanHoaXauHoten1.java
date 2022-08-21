package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoten1 {
	public static String format(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			ArrayList<String> arr = new ArrayList<String>();

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				arr.add(st.nextToken());
			}
			for (String i : arr) {
				System.out.print(format(i) + " ");
			}
			System.out.println();
		}

	}
}
