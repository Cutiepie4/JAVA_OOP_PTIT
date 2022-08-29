package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

	public double getdCong() {
		return dCong;
	}

	public double getDiem() {
		return dToan * 2 + dLi + dHoa + dCong;
	}

	public String getMaTS() {
		return maTS;
	}

	public String submit() {
		if (getDiem() < 24)
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

public class SapXepKetQuaTuyenSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ThiSinh> data = new ArrayList<ThiSinh>();

		while (n-- > 0) {
			sc.nextLine();
			data.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		}

		Collections.sort(data, new Comparator<ThiSinh>() {

			@Override
			public int compare(ThiSinh o1, ThiSinh o2) {
				if (o1.getDiem() > o2.getDiem())
					return -1;
				else if (o1.getDiem() == o2.getDiem())
					return o1.getMaTS().compareTo(o2.getMaTS());
				return 1;
			}
		});
		for (ThiSinh i : data) {
			System.out.println(i);
		}
	}
}