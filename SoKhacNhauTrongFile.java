package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("DATA.in");
		Scanner sc = new Scanner(input);
		TreeMap<Integer, Integer> data = new TreeMap<Integer, Integer>();

		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			if (data.containsKey(x)) {
				data.put(x, data.get(x) + 1);
			} else
				data.put(x, 1);
		}
		for (int i : data.keySet()) {
			System.out.println(i + " " + data.get(i));
		}
	}
}
