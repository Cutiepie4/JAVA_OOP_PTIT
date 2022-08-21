package studyJavaPTIT;

import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKiTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (st.isEmpty() || (!st.isEmpty() && st.peek() != s.charAt(i))) {
				st.push(s.charAt(i));
			} else
				st.pop();
		}
		if (st.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		Stack<Character> st1 = new Stack<Character>();
		while (!st.isEmpty()) {
			st1.push(st.peek());
			st.pop();
		}
		while (!st1.isEmpty()) {
			System.out.print(st1.peek());
			st1.pop();
		}
	}
}
