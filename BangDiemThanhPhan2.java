package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
	private String id, name, idClass;
	private double d1, d2, d3;

	public SinhVien(String id, String name, String idClass, double d1, double d2, double d3) {
		super();
		this.id = id;
		this.name = name;
		this.idClass = idClass;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idClass + " " + d1 + " " + d2 + " " + d3;
	}

}

public class BangDiemThanhPhan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + " " + data.get(i));
		}
	}
}
