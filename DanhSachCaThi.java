package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CaThi {
	private String id, date, time, room;

	public CaThi(int id, String date, String time, String room) {
		super();
		if (id < 10)
			this.id = "C00" + id;
		else if (id < 100)
			this.id = "C0" + id;
		else
			this.id = "C" + id;
		this.date = date;
		this.time = time;
		this.room = room;
	}

	public LocalDateTime getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime time1 = LocalDateTime.parse(date + " " + time, dtf);
		return time1;
	}

	@Override
	public String toString() {
		return id + " " + date + " " + time + " " + room;
	}

}

public class DanhSachCaThi {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("CATHI.in"));
		ArrayList<CaThi> data = new ArrayList<CaThi>();

		int n = Integer.valueOf(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			data.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}

		Collections.sort(data, new Comparator<CaThi>() {

			@Override
			public int compare(CaThi o1, CaThi o2) {
				return o1.getTime().compareTo(o2.getTime());
			}
		});

		for (CaThi i : data) {
			System.out.println(i);
		}
	}
}
