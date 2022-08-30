package studyJavaPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Lecturer {
	private String id, name, exp;

	public Lecturer(int id, String name, String exp) {
		super();
		if (id < 10)
			this.id = "GV0" + id;
		else
			this.id = "GV" + id;
		this.name = name;
		String[] data = exp.split(" ");
		this.exp = "";
		for (int i = 0; i < data.length; i++) {
			this.exp += Character.toUpperCase(data[i].charAt(0));
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + exp;
	}

}

public class DanhSachGiangVienTheoBoMon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		HashMap<String, ArrayList<Lecturer>> data = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			Lecturer a = new Lecturer(i, sc.nextLine(), sc.nextLine());
			if (!data.containsKey(a.getExp())) {
				data.put(a.getExp(), new ArrayList<Lecturer>());
			}
			data.get(a.getExp()).add(a);
		}

		int query = Integer.valueOf(sc.nextLine());
		while (query-- > 0) {
			String s = sc.nextLine();
			String[] datas = s.split(" ");
			s = "";
			for (int i = 0; i < datas.length; i++) {
				s += Character.toUpperCase(datas[i].charAt(0));
			}

			System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
			for (Lecturer i : data.get(s)) {
				System.out.println(i);
			}
		}
	}
}
