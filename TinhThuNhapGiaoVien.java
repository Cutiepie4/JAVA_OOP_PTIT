package studyJavaPTIT;

import java.util.Scanner;

class GiaoVien {
	private String maNgach, hoTen;
	private int luongCoBan, heSoBacLuong, phuCap;

	public GiaoVien() {
		super();

	}

	public GiaoVien(String maNgach, String hoTen, int luongCoBan) {
		super();
		this.maNgach = maNgach;
		StringBuilder sb = new StringBuilder(this.maNgach);
		if (sb.substring(0, 2).toString().equals("GV")) {
			phuCap = 500000;
		} else if (sb.substring(0, 2).toString().equals("HP")) {
			phuCap = 900000;
		} else if (sb.substring(0, 2).toString().equals("HT")) {
			phuCap = 2000000;
		}
		this.heSoBacLuong = Integer.valueOf(sb.substring(2));
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}

	public int getLuong() {
		return heSoBacLuong * luongCoBan + phuCap;
	}

	@Override
	public String toString() {
		return maNgach + " " + hoTen + " " + heSoBacLuong + " " + phuCap + " " + getLuong();
	}

}

public class TinhThuNhapGiaoVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
		System.out.println(a);
	}

}