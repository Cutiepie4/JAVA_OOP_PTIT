package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class TinhTong {

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
		long sum = 0;
		while (sc.hasNext()) {
			String s = sc.next();
			if (check(s))
				sum += Integer.valueOf(s);
		}
		System.out.println(sum);
	}
}
