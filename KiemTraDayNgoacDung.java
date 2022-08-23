package studyJavaPTIT;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {

	public static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		for (Character i : s.toCharArray()) {
			if (i == '[' || i == '(' || i == '{') {
				st.push(i);
			} else {
				if (i == ']') {
					if(!st.isEmpty() && st.peek() == '[') st.pop();
					else return false;
				}
				if (i == ')') {
					if(!st.isEmpty() && st.peek() == '(') st.pop();
					else return false;
				}
				if (i == '}') {
					if(!st.isEmpty() && st.peek() == '{') st.pop();
					else return false;
				}
			}
		}
		if (!st.isEmpty())
			return false;
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (check(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
