package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class TachDoiVaTinhTong {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("DATA.in");
		Scanner sc = new Scanner(input);
		String n = sc.next();
		while (n.length() > 1) {
			String s1 = n.substring(0, n.length() / 2), s2 = n.substring(n.length() / 2);
			n = String.valueOf(new BigInteger(s1).add(new BigInteger(s2)));
			System.out.println(n);
		}
	}
}
