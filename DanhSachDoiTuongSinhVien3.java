package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

	public float getGpa() {
		return gpa;
	}

	public String getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getLop() {
		return lop;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
	}

}

public class DanhSachDoiTuongSinhVien3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			SinhVien a = new SinhVien(i, sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
			data.add(a);
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getGpa() > o2.getGpa())
					return -1;
				return 1;
			}
		});
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}