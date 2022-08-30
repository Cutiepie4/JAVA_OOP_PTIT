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

public class SapXepDanhSachGiangVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<Lecturer> data = new ArrayList<Lecturer>();

		for (int i = 1; i <= n; i++) {
			data.add(new Lecturer(i, sc.nextLine(), sc.nextLine()));
		}

		Collections.sort(data, new Comparator<Lecturer>() {

			@Override
			public int compare(Lecturer o1, Lecturer o2) {
				String[] name1 = o1.getName().split(" ");
				String[] name2 = o2.getName().split(" ");

				if (name1[name1.length - 1] == name2[name2.length - 1])
					return o1.getId().compareTo(o2.getId());
				return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
			}
		});

		for (Lecturer i : data) {
			System.out.println(i);
		}
	}
}
