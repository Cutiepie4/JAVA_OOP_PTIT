package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
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

	public String getCourse() {
		return idClass.substring(1, 3);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idClass + " " + email;
	}

}

public class LietKeSinhVienTheoKhoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		HashMap<String, ArrayList<SinhVien>> data = new HashMap<String, ArrayList<SinhVien>>();

		while (n-- > 0) {
			SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if (data.containsKey(a.getCourse())) {
				data.get(a.getCourse()).add(a);
			} else {
				data.put(a.getCourse(), new ArrayList<SinhVien>());
				data.get(a.getCourse()).add(a);
			}
		}

		int query = Integer.valueOf(sc.nextLine());
		while (query-- > 0) {
			String s = sc.nextLine();
			System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
			for (SinhVien i : data.get(s.substring(2, 4))) {
				System.out.println(i);
			}
		}
	}
}
