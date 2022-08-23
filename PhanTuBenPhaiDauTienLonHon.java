package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class PhanTuBenPhaiDauTienLonHon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}
			Vector<Integer> ans = new Vector<Integer>();
			ans.setSize(n);
			Stack<Integer> st = new Stack<>();
			for (int i = n - 1; i >= 0; i--) {
				while (!st.isEmpty() && st.peek() <= arr.get(i)) {
					st.pop();
				}
				if (!st.isEmpty())
					ans.set(i, st.peek());
				else
					ans.set(i, -1);
				st.push(arr.get(i));
			}
			for (int i = 0; i < n; i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();
		}
	}
}
