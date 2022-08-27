package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaVaSapXep {

	private static String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			String z= st.nextToken();
			z = z.toLowerCase();
			z = z.substring(0, 1).toUpperCase() + z.substring(1);
			ans += z + " ";
		}
		return ans;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		ArrayList<String> data = new ArrayList<String>();
		while (sc.hasNextLine()) {
			data.add(format(sc.nextLine()));
		}
		Collections.sort(data, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] o11 = o1.split(" ");
				String[] o22 = o2.split(" ");
				if (o11[o11.length - 1].equals(o22[o22.length - 1])) {
					return o1.compareTo(o2);
				}
				return o11[o11.length - 1].compareTo(o22[o22.length - 1]);

			}

		});
		for (String i : data) {
			System.out.println(i);
		}
	}
}
