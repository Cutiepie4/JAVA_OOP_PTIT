package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SoXaCach {

	public static HashMap<Integer, ArrayList<String>> data = new HashMap<Integer, ArrayList<String>>();

	public static boolean check(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (Math.abs(a[i] - a[i + 1]) == 1)
				return false;
		}
		return true;
	}

	public static String cvt(int[] a) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s += Integer.toString(a[i]);
		}
		return s;
	}

	public static void init() {

		for (int i = 4; i < 10; i++) {
			int[] a = new int[i];
			ArrayList<String> tmp = new ArrayList<>();
			data.put(i, tmp);
			for (int j = 0; j < i; j++) {
				a[j] = j + 1;
			}
			while (nextPermutation(a)) {
				if (check(a)) {
					data.get(a.length).add(cvt(a));
				}
			}
		}
	}

	public static int[] swap(int[] a, int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;

		return a;
	}

	public static int[] reverse(int[] a, int l, int r) {
		while (l < r) {
			int temp = a[l];
			a[l++] = a[r];
			a[r--] = temp;
		}
		return a;
	}

	public static boolean nextPermutation(int[] a) {

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] < a[i + 1]) {
				for (int j = a.length - 1; j > i; j--) {
					if (a[j] > a[i]) {
						swap(a, i, j);
						break;
					}
				}
				reverse(a, i + 1, a.length - 1);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		init();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n > 3)
				for (String i : data.get(n)) {
					System.out.println(i);
				}
			else
				System.out.println();
		}
	}
}
