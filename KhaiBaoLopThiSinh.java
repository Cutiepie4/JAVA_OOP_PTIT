package studyJavaPTIT;

import java.util.Scanner;

class ThiSinh {
	private float d1, d2, d3;
	private String hoTen, ngaySinh;

	public ThiSinh(String hoTen, String ngaySinh, float d1, float d2, float d3) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	@Override
	public String toString() {
		return hoTen + " " + ngaySinh + " " + String.format("%.1f", d1 + d2 + d3);
	}

}

public class KhaiBaoLopThiSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThiSinh a = new ThiSinh(sc.nextLine(), sc.next(),sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		System.out.println(a);
				
	}
}
