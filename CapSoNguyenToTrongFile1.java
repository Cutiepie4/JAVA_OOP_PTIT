package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile1 {

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

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ArrayList<Integer> arr1 = (ArrayList<Integer>) input.readObject();

		input = new ObjectInputStream(new FileInputStream("DATA2.in"));

		ArrayList<Integer> arr2 = (ArrayList<Integer>) input.readObject();

		TreeSet<Integer> arr11 = new TreeSet<>();

		for (int i : arr1) {
			if (!check[i])
				arr11.add(i);
		}
		
		HashSet<Integer> arr22 = new HashSet<>();

		for (int i : arr2) {
			if (!check[i])
				arr22.add(i);
		}
		
		for (int i : arr11) {
			int m = 1000000 - i;
			if (m > i && !check[m] && arr22.contains(m)) {
				System.out.println(i + " " + m);
			}
		}
	}
}