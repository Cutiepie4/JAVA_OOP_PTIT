package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class SoThuanNghichTrongFile {

	public static boolean check(String s) {
		if (s.length() < 2 || s.length() % 2 == 0 || s.charAt(s.length() / 2) % 2 == 0)
			return false;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i) || s.charAt(i) % 2 == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));

		ArrayList<Integer> arr1 = (ArrayList<Integer>) input.readObject();

		input = new ObjectInputStream(new FileInputStream("DATA2.in"));

		ArrayList<Integer> arr2 = (ArrayList<Integer>) input.readObject();

		int[] count = new int[1000001];

		TreeSet<Integer> ans = new TreeSet<>();

		for (int i : arr1) {
			count[i]++;
		}

		for (int i : arr2) {
			if (count[i] > 0 && check(String.valueOf(i))) {
				if (!ans.contains(i))
					ans.add(i);
				count[i]++;
			}

		}

		int cnt = 10;

		while (cnt-- > 0 && !ans.isEmpty()) {
			int x = ans.pollFirst();
			System.out.println(x + " " + count[x]);
		}

		input.close();

	}
}