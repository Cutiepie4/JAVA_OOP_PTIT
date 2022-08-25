package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String maSV, hoTen, lop, email;

	public SinhVien(String maSV, String hoTen, String lop, String email) {
		super();
		this.maSV = maSV;
		this.hoTen = format(hoTen);
		this.lop = lop;
		this.email = email;
	}

	public String title(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	public String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			ans += title(st.nextToken().toLowerCase());
			ans += " ";
		}
		return ans;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + email;
	}

}

public class DanhSachSinhVienTrongFile1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		while (n-- > 0) {
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
			Collections.sort(data, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					return o1.getMaSV().compareTo(o2.getMaSV());
				}
			});
		}
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
