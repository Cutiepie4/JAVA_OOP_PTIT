package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
	private String name;
	private int ac, submit;

	public SinhVien(String name, int ac, int submit) {
		super();
		this.name = name;
		this.ac = ac;
		this.submit = submit;
	}

	public String getName() {
		return name;
	}

	public int getAc() {
		return ac;
	}

	public int getSubmit() {
		return submit;
	}

	@Override
	public String toString() {
		return name + " " + ac + " " + submit;
	}
}

public class BangXepHang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		while (n-- > 0) {
			sc.nextLine();
			data.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getAc() > o2.getAc())
					return -1;
				else if (o1.getAc() == o2.getAc() && o1.getSubmit() < o2.getSubmit())
					return -1;
				else if (o1.getAc() == o2.getAc() && o1.getSubmit() == o2.getSubmit())
					return o1.getName().compareTo(o2.getName());
				return 1;
			}

		});

		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
