package studyJavaPTIT;

import java.util.Scanner;

class NhanVien {

	private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maST, ngayKiHD;

	public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maST, String ngayKiHD) {
		super();
		this.maNV = "00001";
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.maST = maST;
		this.ngayKiHD = ngayKiHD;
	}

	@Override
	public String toString() {
		return maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maST + " " + ngayKiHD;
	}

}

public class KhaiBaoLopNhanVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
				sc.nextLine());
		System.out.println(a);
	}
}
