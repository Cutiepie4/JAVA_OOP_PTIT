package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class SinhVien {
	private String id, name, idClass, email, company;
	private int ord;

	public SinhVien(int ord, String id, String name, String idClass, String email, String company) {
		super();
		this.ord = ord;
		this.id = id;
		this.name = name;
		this.idClass = idClass;
		this.email = email;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return ord + " " + id + " " + name + " " + idClass + " " + email + " " + company;
	}

}

public class DanhSachThucTap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		HashMap<String, ArrayList<SinhVien>> data = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if (!data.containsKey(a.getCompany())) {
				data.put(a.getCompany(), new ArrayList<SinhVien>());
			}
			data.get(a.getCompany()).add(a);
		}

		for (String i : data.keySet()) {
			Collections.sort(data.get(i), new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
		}

		int query = Integer.valueOf(sc.nextLine());
		while (query-- > 0) {
			String s = sc.nextLine();
			for (SinhVien i : data.get(s)) {
				System.out.println(i);
			}
		}
	}
}
