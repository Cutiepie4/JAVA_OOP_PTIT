package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String maSV, hoTen, soDT, email;

	public SinhVien(String maSV, String hoTen, String soDT, String email) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.email = email;
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

	public String getTen() {
		StringTokenizer st = new StringTokenizer(hoTen);
		String s = "";
		while (st.hasMoreTokens()) {
			s = st.nextToken();
		}
		return s;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + soDT + " " + email;
	}

}

public class SapXepDanhSachSinhVien {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<SinhVien> data = new ArrayList<>();
		while (n-- > 0) {
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (!o1.getTen().equals(o2.getTen())) {
					return o1.getTen().compareTo(o2.getTen());
				}
				if (!o1.getHoTen().equals(o2.getHoTen())) {
					return o1.getHoTen().compareTo(o2.getHoTen());
				}
				return o1.getMaSV().compareTo(o2.getMaSV());
			}

		});
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
