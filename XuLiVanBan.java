package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class XuLiVanBan {
	public static String format(String s) {
		String ans = "";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			ans += st.nextToken().toLowerCase();
			ans += " ";
		}
		StringBuilder sb = new StringBuilder(ans);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String s = "";
		while (sc.hasNextLine()) {
			s += sc.nextLine();
		}
		ArrayList<String> line = new ArrayList<String>();
		StringTokenizer sb = new StringTokenizer(s, ".?!");
		while (sb.hasMoreTokens()) {
			line.add(sb.nextToken());
		}
		for (String i : line) {
			System.out.println(format(i));
		}
	}
}
