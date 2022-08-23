package studyJavaPTIT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0va9 {
	static class Pair {
		public String f;
		public Integer s;

		public Pair(String f, Integer s) {
			super();
			this.f = f;
			this.s = s;
		}

		public String getF() {
			return f;
		}

		public void setF(String f) {
			this.f = f;
		}

		public Integer getS() {
			return s;
		}

		public void setS(Integer s) {
			this.s = s;
		}

	}

	public static String Find(int n) {
		Queue<Pair> Q = new LinkedList<>();
		Q.add(new Pair("9", 9 % n));

		while (!Q.isEmpty()) {
			Pair curr = Q.poll();
			if (curr.getS() == 0)
				return curr.getF();
			Q.add(new Pair(curr.getF() + "0", curr.getS() * 10 % n));
			Q.add(new Pair(curr.getF() + "9", (curr.getS() * 10 + 9) % n));
		}
		return "-1";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(Find(n));
		}
	}
}
