package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiaChiEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> count = new HashMap<>();
		while (t-- > 0) {
			String ans = "";
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			ArrayList<String> arrs = new ArrayList<String>();
			while (st.hasMoreTokens()) {
				arrs.add(st.nextToken().toLowerCase());
			}
			ans += arrs.get(arrs.size() - 1);
			for (int i = 0; i < arrs.size() - 1; i++) {
				ans += Character.toString(arrs.get(i).charAt(0));
			}

			if (count.containsKey(ans)) {
				count.put(ans, count.get(ans) + 1);
				System.out.println(ans + count.get(ans) + "@ptit.edu.vn");
			} else {
				count.put(ans, 1);
				System.out.println(ans + "@ptit.edu.vn");
			}
		}
	}
}
