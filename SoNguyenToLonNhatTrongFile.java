package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SoNguyenToLonNhatTrongFile {

	public static final int MAX = 1000001;

	public static boolean[] check = new boolean[MAX];

	public static void initCheck() {
		check[0] = true;
		check[1] = true;

		for (int i = 2; i * i < MAX; i++) {
			if (!check[i]) {
				for (int j = i * i; j < MAX; j += i) {
					check[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		initCheck();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) input.readObject();

		int[] count = new int[MAX];

		for (Integer i : arr) {
			if (!check[i])
				count[i]++;
		}

		int cnt = 10;

		for (int i = MAX - 1; i >= 2; i--) {
			if (cnt == 0)
				break;

			if (count[i] > 0) {
				System.out.println(i + " " + count[i]);
				cnt--;
			}
		}
	}
}