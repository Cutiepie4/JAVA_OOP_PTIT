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

	public String getIdClass() {
		return idClass;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idClass + " " + email;
	}

}

public class LietKeSinhVienTheoLop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		HashMap<String, ArrayList<SinhVien>> data = new HashMap<String, ArrayList<SinhVien>>();

		while (n-- > 0) {
			SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if (data.containsKey(a.getIdClass())) {
				data.get(a.getIdClass()).add(a);
			} else {
				data.put(a.getIdClass(), new ArrayList<SinhVien>());
				data.get(a.getIdClass()).add(a);
			}
		}
		int query = Integer.valueOf(sc.nextLine());
		while (query-- > 0) {
			String s = sc.nextLine();
			System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
			for (SinhVien i : data.get(s)) {
				System.out.println(i);
			}
		}
	}
}
