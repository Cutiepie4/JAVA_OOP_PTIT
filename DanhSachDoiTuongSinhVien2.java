package studyJavaPTIT;

import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String maSV, hoTen, lop, ngaySinh;
	private float gpa;

	public SinhVien() {
		super();
		maSV = hoTen = lop = ngaySinh = "";
		gpa = 0;
	}

	public SinhVien(int stt, String hoTen, String lop, String ngaySinh, float gpa) {
		super();
		if (stt < 10)
			this.maSV = "B20DCCN00" + stt;
		else
			this.maSV = "B20DCCN0" + stt;
		this.hoTen = "";
		StringTokenizer st = new StringTokenizer(hoTen);
		while (st.hasMoreTokens()) {
			String s = st.nextToken().toLowerCase();
			this.hoTen += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
		}
		this.lop = lop;
		String[] arr = ngaySinh.split("/");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 1) {
				arr[i] = "0" + arr[i];
			}
		}
		this.ngaySinh = String.join("/", arr);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
	}

}

public class DanhSachDoiTuongSinhVien2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			SinhVien a = new SinhVien(i, sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
			System.out.println(a);
		}

	}
}