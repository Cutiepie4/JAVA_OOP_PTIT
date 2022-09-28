package studyJavaPTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LietKeTheoThuTuXuatHien {

	public static LinkedHashSet<String> data = new LinkedHashSet<>();

	public static void split(String s) {
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			data.add(st.nextToken().toLowerCase());
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));

		ArrayList<String> np = (ArrayList<String>) input.readObject();

		input.close();

		for (String i : np) {
			split(i);
		}

		Scanner sc = new Scanner(new File("VANBAN.in"));

		LinkedHashSet<String> vb = new LinkedHashSet<>();

		while (sc.hasNext()) {
			vb.add(sc.next().toLowerCase());
		}

		for (String i : vb) {
			if (data.contains(i)) {
				System.out.println(i);
			}
		}

	}
}
