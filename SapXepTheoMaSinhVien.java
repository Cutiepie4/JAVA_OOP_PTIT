package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
	private String id, name, idclass, email;

	public SinhVien(String id, String name, String idclass, String email) {
		super();
		this.id = id;
		this.name = name;
		this.idclass = idclass;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idclass + " " + email;
	}

}

public class SapXepTheoMaSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		while (sc.hasNextLine()) {
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
