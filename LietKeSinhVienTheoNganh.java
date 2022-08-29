package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class SinhVien {
	private String id, name, idClass, email, expert;

	public SinhVien(String id, String name, String idClass, String email) {
		super();
		this.id = id;
		if (id.substring(3, 7).equals("DCKT")) {
			expert = "KE TOAN";
		} else if (id.substring(3, 7).equals("DCCN") && idClass.charAt(0) != 'E') {
			expert = "CONG NGHE THONG TIN";
		} else if (id.substring(3, 7).equals("DCAT") && idClass.charAt(0) != 'E') {
			expert = "AN TOAN THONG TIN";
		} else if (id.substring(3, 7).equals("DCVT")) {
			expert = "VIEN THONG";
		} else if (id.subSequence(3, 7).equals("DCDT")) {
			expert = "DIEN TU";
		}
		this.name = name;
		this.idClass = idClass;
		this.email = email;
	}

	public String getExpert() {
		return expert;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + idClass + " " + email;
	}

}

public class LietKeSinhVienTheoNganh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		HashMap<String, ArrayList<SinhVien>> data = new HashMap<String, ArrayList<SinhVien>>();

		while (n-- > 0) {
			SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if (data.containsKey(a.getExpert())) {
				data.get(a.getExpert()).add(a);
			} else {
				data.put(a.getExpert(), new ArrayList<SinhVien>());
				data.get(a.getExpert()).add(a);
			}
		}

		int query = Integer.valueOf(sc.nextLine());
		while (query-- > 0) {
			String s = sc.nextLine().toUpperCase();

			System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
			for (SinhVien i : data.get(s)) {
				System.out.println(i);
			}
		}
	}
}
