package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String hoTen, maSV;
	private int d1, d2, d3, stt;

	public SinhVien(int stt, String hoTen, int d1, int d2, int d3) {
		super();
		if (stt < 10)
			maSV = "SV0" + stt;
		else
			maSV = "SV" + stt;
		this.hoTen = format(hoTen);
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	private String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder(st.nextToken().toLowerCase());
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
			ans += sb.toString();
			ans += " ";
		}
		return ans;
	}

	public double getMark() {
		return (double) (d1 * 3 + d2 * 3 + d3 * 2) / 8;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + String.format("%.2f ", getMark());
	}

}

public class TinhDiemTrungBinh {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = sc.nextInt();
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			data.add(new SinhVien(i, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getMark() > o2.getMark()) {
					return -1;
				}
				return 1;
			}
		});
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i));
			if (i > 0 && data.get(i).getMark() == data.get(i - 1).getMark()) {
				System.out.println(data.get(i - 1).getStt());
				data.get(i).setStt(data.get(i - 1).getStt());
			} else {
				System.out.println(i + 1);
				data.get(i).setStt(i + 1);
			}

		}
	}
}
