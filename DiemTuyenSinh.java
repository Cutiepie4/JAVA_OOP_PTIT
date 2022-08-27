package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class ThiSinh {
	private String hoTen, danToc, maTS;
	private double diemThi;

	private String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken().toLowerCase();
			ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + " ";
		}
		return ans;
	}

	public ThiSinh(int stt, String hoTen, double diemThi, String danToc, String kv) {
		super();
		if (stt < 10)
			this.maTS = "TS0" + stt;
		else
			this.maTS = "TS" + stt;
		this.hoTen = format(hoTen);
		this.danToc = danToc;
		this.diemThi = diemThi;
		if (kv.equals("1"))
			this.diemThi += 1.5;
		else if (kv.equals("2"))
			this.diemThi += 1;
		if (!danToc.equals("Kinh"))
			this.diemThi += 1.5;
	}

	public double getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(double diemThi) {
		this.diemThi = diemThi;
	}

	public String getStatus() {
		if (diemThi >= 20.5)
			return "Do";
		return "Truot";
	}

	public String getMaTS() {
		return maTS;
	}

	public void setMaTS(String maTS) {
		this.maTS = maTS;
	}

	@Override
	public String toString() {
		return maTS + " " + hoTen + " " + diemThi + " " + getStatus();
	}

}

public class DiemTuyenSinh {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<ThiSinh> data = new ArrayList<ThiSinh>();

		for (int i = 1; i <= n; i++) {
			data.add(new ThiSinh(i, sc.nextLine(), Double.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<ThiSinh>() {

			@Override
			public int compare(ThiSinh o1, ThiSinh o2) {
				if (o1.getDiemThi() >= o2.getDiemThi()) {
					if (o1.getDiemThi() == o2.getDiemThi()) {
						return o1.getMaTS().compareTo(o2.getMaTS());
					}
					return -1;
				}
				return 1;
			}
		});
		for (ThiSinh i : data) {
			System.out.println(i);
		}
	}
}
