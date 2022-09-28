package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class SoNguyenToTrongFileNhiPhan {

	public static boolean check(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) input.readObject();

		HashMap<Integer, Integer> count = new HashMap<>();

		for (int i = 2; i < 10000; i++) {
			if (check(i)) {
				count.put(i, 0);
			}
		}

		for (Integer i : arr) {
			if (count.containsKey(i))
				count.put(i, count.get(i) + 1);
		}

		for (int i = 0; i < 10000; i++) {
			if (count.containsKey(i) && count.get(i) > 0) {
				System.out.println(i + " " + count.get(i));
			}
		}
	}
}