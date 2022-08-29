package studyJavaPTIT;

import java.text.DecimalFormat;
import java.util.Scanner;

class ThiSinh {
	private String maTS, hoTen;
	private double dToan, dLi, dHoa, dCong;

	public ThiSinh(String maTS, String hoTen, double dToan, double dLi, double dHoa) {
		super();
		this.maTS = maTS;
		if (maTS.substring(0, 3).equals("KV1")) {
			dCong = 0.5;
		}
		if (maTS.substring(0, 3).equals("KV2")) {
			dCong = 1.0;
		}
		if (maTS.substring(0, 3).equals("KV3")) {
			dCong = 2.5;
		}
		this.hoTen = hoTen;
		this.dToan = dToan;
		this.dLi = dLi;
		this.dHoa = dHoa;
	}

	public double getDiem() {
		return dToan * 2 + dLi + dHoa;
	}

	public String submit() {
		if (getDiem() + dCong < 24)
			return "TRUOT";
		return "TRUNG TUYEN";
	}
	
	public String format(double data) {
		if (data == (int) data) {
			return String.valueOf((int) data);
		}
		return String.valueOf(data);
	}

	@Override
	public String toString() {
		return maTS + " " + hoTen + " " + format(dCong) + " " + format(getDiem()) + " " + submit();
	}

}

public class BaiToanTuyenSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(a);
	}
}