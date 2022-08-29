package studyJavaPTIT;

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
		return data;
	}

	public IntSet union(IntSet a) {
		TreeSet<Integer> tmp = new TreeSet<Integer>(data);
		for (Integer i : a.getData()) {
			tmp.add(i);
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

public class LopINTSET {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		IntSet s1 = new IntSet(a);
		IntSet s2 = new IntSet(b);
		IntSet s3 = s1.union(s2);
		System.out.println(s3);
	}
}
