package studyJavaPTIT;

import java.util.Scanner;

class CongNhan {
	private String ten;
	private int luongCoBan, ngayCong, thuong, phuCap;

	public CongNhan(String ten, int luongCoBan, int ngayCong, String chucVu) {
		super();
		this.ten = ten;
		this.luongCoBan = luongCoBan;
		this.ngayCong = ngayCong;
		if (ngayCong > 21) {
			if (ngayCong < 25)
				thuong = 10;
			else
				thuong = 20;
		}

		if (chucVu.equals("GD"))
			phuCap = 250000;
		else if (chucVu.equals("PGD"))
			phuCap = 200000;
		else if (chucVu.equals("TP"))
			phuCap = 180000;
		else
			phuCap = 150000;
	}

	int getLuongThang() {
		return luongCoBan * ngayCong;
	}

	@Override
	public String toString() {
		return "NV01 " + ten + " " + getLuongThang() + " " + (int) getLuongThang() * thuong / 100 + " " + phuCap + " "
				+ (getLuongThang() + getLuongThang() * thuong / 100 + phuCap);
	}

}

public class BaiToanTinhCong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CongNhan a = new CongNhan(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
		System.out.println(a);
	}
}
