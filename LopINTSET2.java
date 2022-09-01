package studyJavaPTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
	private TreeSet<Integer> data = new TreeSet<Integer>();

	public IntSet(int[] a) {
		super();
		for (int i = 0; i < a.length; i++) {
			data.add(a[i]);
		}
	}

	public IntSet(TreeSet<Integer> data) {
		super();
		this.data = new TreeSet<>(data);
	}

	public TreeSet<Integer> getData() {
		return this.data;
	}

	public IntSet intersection(IntSet a) {
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		for (Integer i : data) {
			if (a.getData().contains(i)) {
				tmp.add(i);
			}
		}
		return new IntSet(tmp);
	}

	@Override
	public String toString() {
		String ans = "";
		for (Integer i : data) {
			ans += i + " ";
		}
		return ans;
	}

}

public class LopINTSET2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		IntSet s1 = new IntSet(a);
		IntSet s2 = new IntSet(b);
		IntSet s3 = s1.intersection(s2);
		System.out.println(s3);
	}
}