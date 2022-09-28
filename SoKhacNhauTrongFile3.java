package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SoKhacNhauTrongFile3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) input.readObject();

		int[] data = new int[1000];

		for (Integer i : arr) {
			data[i]++;
		}

		for (int i = 0; i < 1000; i++) {
			if (data[i] > 0) {
				System.out.println(i + " " + data[i]);
			}
		}
	}
}