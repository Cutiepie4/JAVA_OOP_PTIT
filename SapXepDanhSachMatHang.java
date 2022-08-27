package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
	private String tenMH, nhomMH;
	private double gMua, gBan;
	int maMH;

	public MatHang(int maMH, String tenMH, String nhomMH, double gMua, double gBan) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.nhomMH = nhomMH;
		this.gMua = gMua;
		this.gBan = gBan;
	}

	public double getgMua() {
		return gMua;
	}

	public void setgMua(double gMua) {
		this.gMua = gMua;
	}

	public double getgBan() {
		return gBan;
	}

	public void setgBan(double gBan) {
		this.gBan = gBan;
	}

	@Override
	public String toString() {
		return maMH + " " + tenMH + " " + nhomMH + " " + String.format("%.2f", gBan - gMua);
	}

}

public class SapXepDanhSachMatHang {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<MatHang> data = new ArrayList<MatHang>();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			data.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
		}
		Collections.sort(data, new Comparator<MatHang>() {

			@Override
			public int compare(MatHang o1, MatHang o2) {
				if (o1.getgBan() - o1.getgMua() > o2.getgBan() - o2.getgMua()) {
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
