package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep {
	private String maDN, tenDN;
	private int soSV;

	public DoanhNghiep(String maDN, String tenDN, int soSV) {
		super();
		this.maDN = maDN;
		this.tenDN = tenDN;
		this.soSV = soSV;
	}

	public String getMaDN() {
		return maDN;
	}

	public void setMaDN(String maDN) {
		this.maDN = maDN;
	}

	public String getTenDN() {
		return tenDN;
	}

	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}

	public int getSoSV() {
		return soSV;
	}

	public void setSoSV(int soSV) {
		this.soSV = soSV;
	}

	@Override
	public String toString() {
		return maDN + " " + tenDN + " " + soSV;
	}

}

public class DanhSachDoanhNghiep {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("DN.in");
		Scanner sc = new Scanner(input);
		ArrayList<DoanhNghiep> data = new ArrayList<DoanhNghiep>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			sc.nextLine();
			String s1 = sc.nextLine();
			int x = sc.nextInt();
			data.add(new DoanhNghiep(s, s1, x));
		}
		Collections.sort(data, new Comparator<DoanhNghiep>() {

			@Override
			public int compare(DoanhNghiep o1, DoanhNghiep o2) {
				return o1.getMaDN().compareTo(o2.getMaDN());
			}
		});
		for(DoanhNghiep i:data) {
			System.out.println(i);
		}
	}
}
