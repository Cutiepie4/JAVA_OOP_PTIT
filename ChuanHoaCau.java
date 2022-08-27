package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaCau {

	public static String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		ArrayList<String> data = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			data.add(st.nextToken().toLowerCase());
		}

		String ans = "";
		data.set(0, data.get(0).substring(0, 1).toUpperCase() + data.get(0).substring(1));

		for (int i = 0; i < data.size() - 2; i++) {
			ans += data.get(i) + " ";
		}
		char c = data.get(data.size() - 1).charAt(data.get(data.size() - 1).length() - 1);
		if (c == '.' || c == '!' || c == '?') {
			if (data.get(data.size() - 1).length() == 1) {
				ans += data.get(data.size() - 2) + data.get(data.size() - 1);
			} else {
				ans += data.get(data.size() - 2) + " " + data.get(data.size() - 1);
			}
		} else
			ans += data.get(data.size() - 2) + " " + data.get(data.size() - 1) + ".";

		return ans;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.length() > 0)
				System.out.println(format(s));
		}
	}
}
