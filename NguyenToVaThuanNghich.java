package testnetbeans;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {

	public static boolean check1(int n) {
		String s = String.valueOf(n);

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static boolean check(int n) {
		if(!check1(n)) return false;
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));

		ArrayList<Integer> data1 = (ArrayList<Integer>) input.readObject();

		input = new ObjectInputStream(new FileInputStream("DATA2.in"));

		ArrayList<Integer> data2 = (ArrayList<Integer>) input.readObject();

		int[] count1 = new int[10000];
		int[] count2 = new int[10000];

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i : data1) {
			count1[i]++;

		}

		for (int i : data2) {
		    data1.add(i);
			count2[i]++;
		}

		Collections.sort(data1);

		LinkedHashSet<Integer> x = new LinkedHashSet<>();

		for (int i : data1) {
			x.add(i);
		}

		for (int i : x) {
			if (check(i)) {
				System.out.println(i + " " + count1[i] + " " + count2[i]);
			}
		}
	}

}