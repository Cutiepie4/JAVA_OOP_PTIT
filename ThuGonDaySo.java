package studyJavaPTIT;

import java.util.Scanner;
import java.util.Stack;

public class ThuGonDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (st.isEmpty() || (!st.isEmpty() && (st.peek() + x) % 2 == 1)) {
				st.push(x);
			} else
				st.pop();

		}
		System.out.println(st.size());
	}
}
