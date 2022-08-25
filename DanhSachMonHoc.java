package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc {
	private String maMon, tenMon;
	private int soTC;

	public MonHoc(String maMon, String tenMon, int soTC) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.soTC = soTC;
	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getSoTC() {
		return soTC;
	}

	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}

	@Override
	public String toString() {
		return maMon + " " + tenMon + " " + soTC;
	}

}

public class DanhSachMonHoc {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("MONHOC.in");
		Scanner sc = new Scanner(input);
		int n = sc.nextInt();
		ArrayList<MonHoc> data = new ArrayList<MonHoc>();

		for (int i = 0; i < n; i++) {
			String s1 = sc.next();
			sc.nextLine();
			String s2 = sc.nextLine();
			int tmp = sc.nextInt();
			data.add(new MonHoc(s1, s2, tmp));
		}
		Collections.sort(data, new Comparator<MonHoc>() {

			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				return o1.getTenMon().compareTo(o2.getTenMon());
			}
		});
		for (MonHoc i : data) {
			System.out.println(i);
		}
	}
}
