package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DayConTangDan {
	public static ArrayList<String> data = new ArrayList<>();

	public static void back(int idx, int n, ArrayList<Integer> arr, String s) {
		for (int i = idx + 1; i < n; i++) {
			if (arr.get(i) >= arr.get(idx)) {
				String tmp = s + " " + arr.get(i);
				data.add(tmp);
				back(i, n, arr, tmp);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			String s = "";
			s += arr.get(i);
			back(i, n, arr, s);

		}
		Collections.sort(data);
		for (String i : data) {
			System.out.println(i);
		}
	}
}
