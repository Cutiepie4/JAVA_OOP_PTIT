package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTenTrongFile {

	public static String format(String s) {
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("DATA.in");
		Scanner sc = new Scanner(input);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals("END"))
				return;
			StringTokenizer st = new StringTokenizer(s);
			ArrayList<String> data = new ArrayList<String>();

			while (st.hasMoreTokens()) {
				data.add(format(st.nextToken()));
			}
			for (String i : data) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
