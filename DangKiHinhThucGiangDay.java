package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc {
	private String id, name, credit, lecture, practice;

	public MonHoc(String id, String name, String credit, String lecture, String practice) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.lecture = lecture;
		this.practice = practice;
	}

	public String getPractice() {
		return practice;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + credit + " " + lecture + " " + practice;
	}

}

public class DangKiHinhThucGiangDay {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<MonHoc> data = new ArrayList<MonHoc>();
		
		while (n-- > 0) {
			MonHoc a = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			if (!a.getPractice().equals("Truc tiep"))
				data.add(a);
		}
		
		Collections.sort(data, new Comparator<MonHoc>() {

			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		
		for (MonHoc i : data) {
			System.out.println(i);
		}
	}
}
