package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
	private TreeSet<String> data = new TreeSet<>();

	public WordSet(String input) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(input));
		while (sc.hasNext()) {
			data.add(sc.next().toLowerCase());
		}
	}

	public TreeSet<String> getData() {
		return data;
	}

	public String difference(WordSet a) {
		String ans = "";
		for (String i : data) {
			if (!a.getData().contains(i)) {
				ans += i + " ";
			}
		}
		return ans;
	}

}

public class HieuCuaHaiTapTu {

	public static void main(String[] args) throws IOException {
		WordSet s1 = new WordSet("DATA1.in");
		WordSet s2 = new WordSet("DATA2.in");
		System.out.println(s1.difference(s2));
		System.out.println(s2.difference(s1));
	}
}
