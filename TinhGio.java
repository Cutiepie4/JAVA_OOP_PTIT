package studyJavaPTIT;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GameThu {
	private String id, name, timeStart, timeEnd;

	public GameThu(String id, String name, String timeStart, String timeEnd) {
		super();
		this.id = id;
		this.name = name;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public long getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime t1 = LocalTime.parse(timeStart, dtf);
		LocalTime t2 = LocalTime.parse(timeEnd, dtf);

		return ChronoUnit.MINUTES.between(t1, t2);
	}

	private String getHour() {
		long time = getTime();
		long hour = time / 60;
		long minutes = time % 60;
		return hour + " gio " + minutes + " phut";
	}

	@Override
	public String toString() {
		return id + " " + name + " " + getHour();
	}

}

public class TinhGio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<GameThu> data = new ArrayList<GameThu>();
		while (n-- > 0) {
			data.add(new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(data, new Comparator<GameThu>() {

			@Override
			public int compare(GameThu o1, GameThu o2) {
				if (o1.getTime() > o2.getTime())
					return -1;
				return 1;
			}
		});
		for (GameThu i : data) {
			System.out.println(i);
		}
	}
}
