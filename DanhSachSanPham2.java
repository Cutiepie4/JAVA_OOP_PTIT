package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
	private String maSP, tenSP;
	private int gBan, baoHanh;

	public SanPham(String maSP, String tenSP, int gBan, int baoHanh) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gBan = gBan;
		this.baoHanh = baoHanh;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public int getgBan() {
		return gBan;
	}

	public void setgBan(int gBan) {
		this.gBan = gBan;
	}

	@Override
	public String toString() {
		return maSP + " " + tenSP + " " + gBan + " " + baoHanh;
	}

}

public class DanhSachSanPham2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SANPHAM.in"));
		int n = sc.nextInt();
		ArrayList<SanPham> data = new ArrayList<SanPham>();

		while (n-- > 0) {
			sc.nextLine();
			data.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(data, new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				if (o1.getgBan() > o2.getgBan())
					return -1;
				else if (o1.getgBan() == o2.getgBan()) {
					return o1.getMaSP().compareTo(o2.getMaSP());
				}
				return 1;
			}
		});
		for (SanPham i : data) {
			System.out.println(i);
		}
	}
}
