package studyJavaPTIT;

import java.util.*;

public class HinhSao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Vector<Integer>> data = new Vector<Vector<Integer>>();
		data.setSize(n + 1);
		for (int i = 1; i <= n; i++) {
			data.set(i, new Vector<Integer>());
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			data.get(a).add(b);
			data.get(b).add(a);
		}
		int cntn = 0;
		boolean ok = true;
		for (int i = 1; i <= n; i++) {
			if (data.get(i).size() > 1) {
				if (data.get(i).size() == n - 1) {
					cntn++;
					if (cntn > 1) {
						ok = false;
						break;
					}
				} else if (data.get(i).size() > 1) {
					ok = false;
					break;
				}
			}
		}
		if (ok)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
