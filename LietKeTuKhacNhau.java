package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
	public TreeSet<String> data = new TreeSet<String>();

	public WordSet(String s) throws FileNotFoundException {
		File input = new File(s);
		Scanner sc = new Scanner(input);
		while (sc.hasNext()) {
			data.add(sc.next().toLowerCase());
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (String i : data) {
			s += i;
			s += "\n";
		}
		return s;
	}

}

public class LietKeTuKhacNhau {
	public static void main(String[] args) throws IOException {
		WordSet ws = new WordSet("VANBAN.in");
		System.out.println(ws);
	}
}