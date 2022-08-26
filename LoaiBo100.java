package studyJavaPTIT;

import java.util.Scanner;

public class LoaiBo100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int Max = 0;
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			int[] check = new int[s.length()];
			while (true) {
				int idx = sb.indexOf("100");
				if (idx == -1)
					break;
				sb = sb.replace(idx, idx + 3, "");
				int cnt = 3, i = idx;
				while (cnt > 0) {
					if (check[i] == 0) {
						check[i] = 1;
						cnt--;
					} else
						i++;
				}
			}

			int tmp = 0;
			for (int i = 0; i < s.length(); i++) {
				if (check[i] == 1) {
					tmp++;
					Max = Math.max(Max, tmp);
				} else
					tmp = 0;
			}
			System.out.println(Max);
		}
	}
}
