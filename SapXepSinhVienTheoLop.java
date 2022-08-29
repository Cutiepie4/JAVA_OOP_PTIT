package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
	private String id, name, idClass, email;

	public SinhVien(String id, String name, String idClass, String email) {
		super();
		this.id = id;
		this.name = name;
		this.idClass = idClass;
		this.email = email;
	}

	public String getIdClass() {
		return idClass;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idClass + " " + email;
	}

}

public class SapXepSinhVienTheoLop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();

		while (n-- > 0) {
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (!o1.getIdClass().equals(o2.getIdClass())) {
					return o1.getIdClass().compareTo(o2.getIdClass());
				}
				return o1.getId().compareTo(o2.getId());
			}
		});
		for (SinhVien i : data) {
			System.out.println(i);
		}
	}
}
