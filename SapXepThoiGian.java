package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time {
	private int hour, min, sec;

	public Time(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	@Override
	public String toString() {
		return hour + " " + min + " " + sec;
	}

}

public class SapXepThoiGian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Time> data = new ArrayList<Time>();
		int n = sc.nextInt();
		while (n-- > 0) {
			data.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(data, new Comparator<Time>() {

			@Override
			public int compare(Time o1, Time o2) {
				if (o1.getHour() < o2.getHour())
					return -1;
				else if (o1.getHour() == o2.getHour() && o1.getMin() < o2.getMin())
					return -1;
				else if (o1.getHour() == o2.getHour() && o1.getMin() == o2.getMin() && o1.getSec() < o2.getSec())
					return -1;
				return 1;
			}
		});
		for (Time i : data) {
			System.out.println(i);
		}
	}

}