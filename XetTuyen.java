package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class ThiSinh {
	private String id, name, date;
	private double lecture, practice;

	public ThiSinh(int id, String name, String date, double lecture, double practice) {
		super();
		if (id < 10)
			this.id = "PH0" + id;
		else
			this.id = "PH" + id;
		this.name = format(name);
		this.date = date;
		this.lecture = lecture;
		this.practice = practice;
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

	public int getPoint() {
		double bonus = 0;
		if (lecture >= 8 && practice >= 8) {
			bonus = 1;
		} else if (lecture >= 7.5 && practice >= 7.5) {
			bonus = 0.5;
		}
		int x = (int) Math.round((lecture + practice) / 2 + bonus);
		if (x > 10)
			x = 10;
		return x;
	}

	public String getOverall() {
		int x = getPoint();
		if (x < 5)
			return "Truot";
		else if (x <= 6)
			return "Trung binh";
		else if (x <= 7)
			return "Kha";
		else if (x <= 8)
			return "Gioi";
		return "Xuat sac";
	}

	public long getAge() {
		String[] data = date.split("/");
		return 2021 - Integer.valueOf(data[2]);
	}

	@Override
	public String toString() {
		return id + " " + name + getAge() + " " + getPoint() + " " + getOverall();
	}

}

public class XetTuyen {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("XETTUYEN.in"));
		ArrayList<ThiSinh> data = new ArrayList<ThiSinh>();
		int n = Integer.valueOf(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			data.add(new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.valueOf(sc.nextLine()),
					Double.valueOf(sc.nextLine())));
		}

		for (ThiSinh i : data) {
			System.out.println(i);
		}
	}
}
