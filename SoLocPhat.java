package studyJavaPTIT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class SoLocPhat {

	public static Vector<Vector<String>> data = new Vector<>();

	public static void init() {
		data.setSize(20);
		for (int i = 0; i < 16; i++) {
			data.set(i, new Vector<String>());
		}
		Queue<String> Q = new LinkedList<>();
		Q.add("");

		while (!Q.isEmpty()) {
			String s = Q.poll();
			if (s.length() > 15)
				return;
			data.get(s.length()).add(s);
			Q.add(s + "6");
			Q.add(s + "8");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		init();
		while (t-- > 0) {
			int n = sc.nextInt();
			int cnt = 0;
			for (int i = n; i > 0; i--) {
				cnt += data.get(i).size();
			}
			System.out.println(cnt);
			for (int i = n; i > 0; i--) {
				for (int j = data.get(i).size() - 1; j >= 0; j--) {
					System.out.print(data.get(i).get(j) + " ");
				}
			}
			System.out.println();
		}
	}
}
