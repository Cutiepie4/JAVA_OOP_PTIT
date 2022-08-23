package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
	private int soMaMH;
	private String tenMH, donViTinh;
	private int gMua, gBan;

	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatHang(String tenMH, String donViTinh, int gMua, int gBan, int soMaMH) {
		super();
		this.tenMH = tenMH;
		this.donViTinh = donViTinh;
		this.gMua = gMua;
		this.gBan = gBan;
		this.soMaMH = soMaMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public int getgMua() {
		return gMua;
	}

	public void setgMua(int gMua) {
		this.gMua = gMua;
	}

	public int getgBan() {
		return gBan;
	}

	public void setgBan(int gBan) {
		this.gBan = gBan;
	}

	public int getSoMaMH() {
		return soMaMH;
	}

	public void setSoMaMH(int soMaMH) {
		this.soMaMH = soMaMH;
	}

	@Override
	public String toString() {
		String s = String.valueOf(soMaMH);
		while (s.length() < 3)
			s = "0" + s;
		s = "MH" + s + " ";
		return s + tenMH + " " + donViTinh + " " + String.format("%d %d %d", gMua, gBan, gBan - gMua);
	}

}

public class DanhSachMatHang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<MatHang> data = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String tenMH = sc.nextLine(), dVi = sc.nextLine();
			int gMua = sc.nextInt(), gBan = sc.nextInt();
			sc.nextLine();
			MatHang tmp = new MatHang(tenMH, dVi, gMua, gBan, i);
			data.add(tmp);
		}
		Collections.sort(data, new Comparator<MatHang>() {

			@Override
			public int compare(MatHang o1, MatHang o2) {
				if (o1.getgBan() - o1.getgMua() > o2.getgBan() - o2.getgMua())
					return -1;
				else if (o1.getgBan() - o1.getgMua() == o2.getgBan() - o2.getgMua()
						&& o1.getSoMaMH() < o2.getSoMaMH()) {
					return -1;
				}
				return 1;
			}
		});
		for (MatHang i : data) {
			System.out.println(i);
		}
	}
}
