package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep {
	private String maDN, tenDN;
	private int soSV;

	public DoanhNghiep(String maDN, String tenDN, int soSV) {
		super();
		this.maDN = maDN;
		this.tenDN = tenDN;
		this.soSV = soSV;
	}

	public String getMaDN() {
		return maDN;
	}

	public String getTenDN() {
		return tenDN;
	}

	public int getSoSV() {
		return soSV;
	}

	@Override
	public String toString() {
		return maDN + " " + tenDN + " " + soSV;
	}

}

public class DanhSachDoanhNghiepNhanSinhVienThucTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<DoanhNghiep> data = new ArrayList<DoanhNghiep>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			sc.nextLine();
			String s1 = sc.nextLine();
			int x = sc.nextInt();
			data.add(new DoanhNghiep(s, s1, x));
		}
		Collections.sort(data, new Comparator<DoanhNghiep>() {

			@Override
			public int compare(DoanhNghiep o1, DoanhNghiep o2) {
				if (o1.getSoSV() > o2.getSoSV())
					return -1;
				else if (o1.getSoSV() == o2.getSoSV())
					return o1.getMaDN().compareTo(o2.getMaDN());
				return 1;
			}
		});

		int query = sc.nextInt();
		while (query-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
			for (DoanhNghiep i : data) {
				if(i.getSoSV() >= a && i.getSoSV() <= b)
					System.out.println(i);
			}
		}
		
	}
}
