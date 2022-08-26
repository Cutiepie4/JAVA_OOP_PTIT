package studyJavaPTIT;

import java.io.File;
import java.io.IOException;
import java.util.*;

class LoaiPhong implements Comparable {
	private String kiHieu, ten;
	private int donGia;
	private double phiPV;

	public LoaiPhong(String s) {
		super();
		String[] data = s.split(" ");
		this.kiHieu = data[0];
		this.ten = data[1];
		this.donGia = Integer.valueOf(data[2]);
		this.phiPV = Double.valueOf(data[3]);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	
	public int compareTo(Object b) {
		LoaiPhong b1 = (LoaiPhong) b;
		if (this.getTen().equals(b1.getTen())) {
			return 0;
		}
		return this.getTen().compareTo(b1.getTen());
	}

	@Override
	public String toString() {
		return kiHieu + " " + ten + " " + donGia + " " + phiPV;
	}

}

public class LoaiPhong {
	public static void main(String[] args) throws IOException {
		ArrayList<LoaiPhong> ds = new ArrayList<>();
		Scanner in = new Scanner(new File("PHONG.in"));
		int n = Integer.parseInt(in.nextLine());
		while (n-- > 0) {
			ds.add(new LoaiPhong(in.nextLine()));
		}
		Collections.sort(ds);
		for (LoaiPhong tmp : ds) {
			System.out.println(tmp);
		}
	}
}
