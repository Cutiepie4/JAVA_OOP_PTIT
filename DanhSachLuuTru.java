package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class KhachHang {
	private String maKH, hoTen, maPhong, ngayDen, ngayDi;

	public KhachHang(int maKH, String hoTen, String maPhong, String ngayDen, String ngayDi) {
		super();
		if (maKH < 10)
			this.maKH = "KH0" + maKH;
		else
			this.maKH = "KH" + maKH;
		this.hoTen = hoTen;
		this.maPhong = maPhong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public int countDay() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(ngayDen, dtf);
		LocalDate date2 = LocalDate.parse(ngayDi, dtf);

		long diffDays = ChronoUnit.DAYS.between(date1, date2);

		return Math.abs((int) diffDays);
	}

	@Override
	public String toString() {
		return maKH + " " + hoTen + " " + maPhong + " " + countDay();
	}

}

public class DanhSachLuuTru {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACH.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<KhachHang> data = new ArrayList<KhachHang>();

		for (int i = 1; i <= n; i++) {
			data.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				if (o1.countDay() > o2.countDay())
					return -1;
				return 1;
			}
		});
		for (KhachHang i : data) {
			System.out.println(i);
		}
	}
}
