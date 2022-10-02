package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TongChuSo {

	public static String convert(String s) {
		String ans = "";
		for (Character i : s.toCharArray()) {
			if (Character.isDigit(i))
				ans += String.valueOf(i);
		}
		while (ans.charAt(0) == '0') {
			ans = new StringBuilder(ans).deleteCharAt(0).toString();
		}
		return ans;
	}

	public static int sumDigit(String s) {
		int ans = 0;
		for (Character i : s.toCharArray()) {
			ans += i - '0';
		}
		return ans;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));

		ArrayList<String> data = (ArrayList<String>) input.readObject();

		for (String i : data) {
			String s = convert(i);
			System.out.println(s + " " + sumDigit(s));
		}
	}

}