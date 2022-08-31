package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class KhachHang {
	private String name, idRoom, dayStart, dayEnd, id;
	private int additionalFee;

	public KhachHang(int id, String name, String idRoom, String dayStart, String dayEnd, int additionalFee) {
		super();
		if (id < 10)
			this.id = "KH0" + id;
		else
			this.id = "KH" + id;
		this.name = format(name);
		this.idRoom = idRoom;
		this.dayStart = formatTime(dayStart);
		this.dayEnd = formatTime(dayEnd);
		this.additionalFee = additionalFee;
	}

	private String formatTime(String s) {
		String[] data = s.split("/");
		String ans = "";
		for (int i = 0; i < 2; i++) {
			if (data[i].length() < 2)
				data[i] = "0" + data[i];
			ans += data[i] + "/";
		}
		ans += data[2];
		return ans;
	}

	private String format(String s) {
		String ans = "";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken().toLowerCase();
			ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + " ";
		}
		return ans;
	}

	public long getDays() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(dayStart, dtf);
		LocalDate date2 = LocalDate.parse(dayEnd, dtf);

		return ChronoUnit.DAYS.between(date1, date2) + 1;
	}

	public long getFee() {
		int unitPrice = 0;
		if (idRoom.substring(0, 1).equals("1"))
			unitPrice = 25;
		else if (idRoom.substring(0, 1).equals("2"))
			unitPrice = 34;
		else if (idRoom.substring(0, 1).equals("3"))
			unitPrice = 50;
		else
			unitPrice = 80;
		return unitPrice * getDays() + additionalFee;
	}

	@Override
	public String toString() {
		return id + " " + name + idRoom + " " + getDays() + " " + getFee();
	}

}

public class TinhTienPhong {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<KhachHang> data = new ArrayList<KhachHang>();

		for (int i = 1; i <= n; i++) {
			data.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
					Integer.valueOf(sc.nextLine())));
		}

		Collections.sort(data, new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				if (o1.getFee() > o2.getFee())
					return -1;
				return 1;
			}
		});
		for (KhachHang i : data) {
			System.out.println(i);
		}
	}
}
