package studyJavaPTIT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien {
	private String id, name, sex, adr, idtax, dCtr, dob;

	public NhanVien(int stt, String name, String sex, String dob, String adr, String idtax, String dCtr) {
		super();
		this.id = String.valueOf(stt);
		while (this.id.length() < 5)
			this.id = "0" + this.id;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.adr = adr;
		this.idtax = idtax;
		this.dCtr = dCtr;
	}

	public LocalDate getDob() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dob, dtf);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + sex + " " + dob + " " + adr + " " + idtax + " " + dCtr;
	}

}

public class SapXepDanhSachDoiTuongNhanVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<NhanVien> data = new ArrayList<NhanVien>();
		for (int i = 1; i <= n; i++) {
			NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
					sc.nextLine());
			data.add(a);
		}
		Collections.sort(data, new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				return o1.getDob().compareTo(o2.getDob());
			}
		});
		for (NhanVien i : data) {
			System.out.println(i);
		}
	}
}
