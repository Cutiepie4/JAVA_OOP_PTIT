package studyJavaPTIT;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
	public static int check(String s) {
		int max = 0, cnt = 0;
		Stack<Integer> st = new Stack<Integer>();
		int[] mark = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				st.push(i);
			else {
				if (!st.isEmpty()) {
					mark[st.peek()] = mark[i] = 1;
					st.pop();
				}
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (mark[i] == 1) {
				cnt++;
				max = Math.max(max, cnt);
			} else
				cnt = 0;
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(check(s));
		}
	}
}
