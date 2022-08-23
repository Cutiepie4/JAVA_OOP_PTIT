package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TimTuThuanNghichDaiNhat {

	public static boolean check(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int Max = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> string = new ArrayList<String>();
		HashMap<String, Integer> count = new HashMap<String, Integer>();

		while (sc.hasNext()) {
			String s = sc.next();
			string.add(s);
			if (count.containsKey(s)) {
				count.put(s, count.get(s) + 1);
			} else
				count.put(s, 1);

			if (check(s) && s.length() >= Max) {
				if (Max == s.length()) {
					data.add(s);
				} else {
					Max = s.length();
					data.clear();
					data.add(s);
				}
			}
		}

		for (String i : string) {
			if (data.contains(i)) {
				if (count.get(i) > 0) {
					System.out.println(i + " " + count.get(i));
					count.put(i, 0);
				}
			}
		}

	}
}
