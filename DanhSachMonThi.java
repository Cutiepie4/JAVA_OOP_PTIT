package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonThi {
	private String maMH, tenMH, hTT;

	public MonThi(String maMH, String tenMH, String hTT) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.hTT = hTT;
	}

	public String getMaMH() {
		return maMH;
	}

	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}

	@Override
	public String toString() {
		return maMH + " " + tenMH + " " + hTT;
	}

}

public class DanhSachMonThi {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		ArrayList<MonThi> data = new ArrayList<MonThi>();

		int n = Integer.valueOf(sc.nextLine());
		while (n-- > 0) {
			data.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<MonThi>() {

			@Override
			public int compare(MonThi o1, MonThi o2) {
				return o1.getMaMH().compareTo(o2.getMaMH());
			}
		});
		for (MonThi i : data) {
			System.out.println(i);
		}
	}
}
