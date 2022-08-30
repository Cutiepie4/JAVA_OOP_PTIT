package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

public class TimKiemGiangVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<Lecturer> data = new ArrayList<Lecturer>();

		for (int i = 1; i <= n; i++) {
			data.add(new Lecturer(i, sc.nextLine(), sc.nextLine()));
		}

		int query = Integer.valueOf(sc.nextLine());

		while (query-- > 0) {
			String s = sc.nextLine();
			System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
			for (Lecturer i : data) {
				if (i.getName().toLowerCase().contains(s.toLowerCase()))
					System.out.println(i);
			}
		}
	}
}
