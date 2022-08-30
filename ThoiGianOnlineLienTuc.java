package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SinhVien {
	private String name, timeStart, timeEnd;

	public SinhVien(String name, String timeStart, String timeEnd) {
		super();
		this.name = name;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	private String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken().toLowerCase();
			ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1) + " ";
		}
		return ans;
	}

	public String getName() {
		return name;
	}

	public long getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime times = LocalDateTime.parse(timeStart, dtf);
		LocalDateTime timee = LocalDateTime.parse(timeEnd, dtf);
		return ChronoUnit.MINUTES.between(times, timee);
	}

	@Override
	public String toString() {
		return format(name) + " " + getTime();
	}

}

public class ThoiGianOnlineLienTuc {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("ONLINE.in"));
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<SinhVien> data = new ArrayList<>();
		while (n-- > 0) {
			data.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getTime() > o2.getTime())
					return -1;
				else if (o1.getTime() == o2.getTime()) {
					return o1.getName().compareTo(o2.getName());
				}
				return 1;
			}
		});
		for (SinhVien i : data) {
			System.out.println(i);
		}

	}
}
