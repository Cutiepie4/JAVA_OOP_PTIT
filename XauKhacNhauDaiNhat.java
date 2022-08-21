package studyJavaPTIT;

import java.util.Scanner;
import java.util.TreeSet;

public class XauKhacNhauDaiNhat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s1 = sc.next(), s2 = sc.next();
			StringBuilder sb1 = new StringBuilder(s1);
			StringBuilder sb2 = new StringBuilder(s2);
			TreeSet<String> set1 = new TreeSet<String>();
			TreeSet<String> set2 = new TreeSet<String>();

			for (int i = 0; i < s1.length(); i++) {
				for (int j = i + 1; j < s1.length() + 1; j++) {
					set1.add(sb1.substring(i, j).toString());
				}
			}

			for (int i = 0; i < s2.length(); i++) {
				for (int j = i + 1; j < s2.length() + 1; j++) {
					set2.add(sb2.substring(i, j).toString());
				}
			}
			int Max = -1;

			for (String i : set1) {
				if (!set2.contains(i)) {
					Max = Math.max(Max, i.length());
				}
			}

			for (String i : set2) {
				if (!set1.contains(i)) {
					Max = Math.max(Max, i.length());
				}
			}
			System.out.println(Max);
		}
	}
}
