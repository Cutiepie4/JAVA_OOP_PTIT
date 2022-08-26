package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SinhVien {
	private String hoTen, lop, ngaySinh, maSV;
	private double gpa;

	public SinhVien(int i, String hoTen, String lop, String ngaySinh, double gpa) {
		super();
		if (i < 10)
			this.maSV = "B20DCCN00" + i;
		else
			this.maSV = "B20DCCN0" + i;
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = format(ngaySinh);
		this.gpa = gpa;
	}

	private String format(String s) {
		String[] data = s.split("/");
		String ans = "";
		if (data[0].length() < 2)
			ans += "0" + data[0] + "/";
		else
			ans += data[0] + "/";
		if (data[1].length() < 2)
			ans += "0" + data[1] + "/";
		else
			ans += data[1] + "/";
		ans += data[2];
		return ans;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
	}

}

public class DanhSachSinhVienTrongFile2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SV.in"));
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
			System.out.println(a);
		}
	}
}
