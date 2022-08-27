package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
	private String id, name, sex, dob, adr, idtax, dCtr;

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

	@Override
	public String toString() {
		return id + " " + name + " " + sex + " " + dob + " " + adr + " " + idtax + " " + dCtr;
	}

}

public class DanhSachDoiTuongNhanVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
					sc.nextLine());
			System.out.println(a);
		}
	}
}
