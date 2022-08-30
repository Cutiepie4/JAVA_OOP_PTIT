package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String id, name;
	private double score;

	public SinhVien(int id, String name, double score) {
		super();
		if (id < 10)
			this.id = "SV0" + id;
		else
			this.id = "SV" + id;

		this.name = format(name);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	private String format(String s) {
		String ans = "";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken().toLowerCase();
			ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + " ";
		}
		return ans;
	}

	public String getOverall() {
		if (score < 5)
			return "KEM";
		else if (score < 6.5)
			return "TRUNG BINH";
		else if (score < 8)
			return "KHA";
		return "GIOI";
	}

	@Override
	public String toString() {
		return id + " " + name + String.format("%.2f", score) + " " + getOverall();
	}

}

public class XepLoai {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = sc.nextInt();
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			data.add(new SinhVien(i, sc.nextLine(),
					sc.nextDouble() * 0.25 + sc.nextDouble() * 0.35 + sc.nextDouble() * 0.4));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getScore() > o2.getScore())
					return -1;
				return 1;
			}
		});
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
