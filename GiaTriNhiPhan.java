package studyJavaPTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GiaTriNhiPhan {

	public static String convert(String s) {
		String ans = "";
		for (Character i : s.toCharArray()) {
			if (i == '0' || i == '1')
				ans += String.valueOf(i);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));

		ArrayList<String> data = (ArrayList<String>) input.readObject();

		for (String i : data) {
			String s = convert(i);
			System.out.println(s + " " + Long.valueOf(s, 2));
		}
	}

}