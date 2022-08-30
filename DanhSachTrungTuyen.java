package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class ThiSinh {
	private String id, name;
	private double score, extraPoint;

	public ThiSinh(String id, String name, double score) {
		super();
		this.id = id;
		if (this.id.substring(0, 3).equals("KV1"))
			extraPoint = 0.5;
		else if (this.id.substring(0, 3).equals("KV2"))
			extraPoint = 1.0;
		else if (this.id.substring(0, 3).equals("KV3"))
			extraPoint = 2.5;
		this.name = format(name);
		this.score = score + extraPoint;
	}

	public String getId() {
		return id;
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

	private String format(double x) {
		if (x == (int) x)
			return String.valueOf((int) x);
		return String.valueOf(x);
	}

	@Override
	public String toString() {
		return id + " " + name + format(extraPoint) + " " + format(score);
	}
}

public class DanhSachTrungTuyen {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = sc.nextInt();
		ArrayList<ThiSinh> data = new ArrayList<ThiSinh>();
		while (n-- > 0) {
			sc.nextLine();
			data.add(
					new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble() * 2 + sc.nextDouble() + sc.nextDouble()));
		}
		Collections.sort(data, new Comparator<ThiSinh>() {

			@Override
			public int compare(ThiSinh o1, ThiSinh o2) {
				if (o1.getScore() > o2.getScore())
					return -1;
				else if (o1.getScore() == o2.getScore())
					return o1.getId().compareTo(o2.getId());
				return 1;
			}

		});

		int goal = sc.nextInt();
		int idx = 0;
		double basisPoint = 0;

		while (goal-- > 0) {
			basisPoint = data.get(idx++).getScore();
		}

		System.out.println(String.format("%.1f", basisPoint));
		for (ThiSinh i : data) {
			if (i.getScore() >= basisPoint) {
				System.out.println(i + " " + "TRUNG TUYEN");
			} else
				System.out.println(i + " " + "TRUOT");
		}
	}
}
