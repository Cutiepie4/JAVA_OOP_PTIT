package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LoaiBoSoNguyen {
	public static boolean check(String s) {
		if (s.length() > 9)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("DATA.in");
		Scanner sc = new Scanner(input);
		ArrayList<String> data = new ArrayList<String>();

		while (sc.hasNext()) {
			String s = sc.next();
			if (!check(s))
				data.add(s);
		}
		Collections.sort(data);
		for (String i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
