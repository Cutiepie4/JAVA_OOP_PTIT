package studyJavaPTIT;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
	private String name;
	private ChronoLocalDate dob;

	public Person(String[] data) {
		super();
		this.name = data[0];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dob = LocalDate.parse(data[1], dtf);
	}

	public ChronoLocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class TreNhatGiaNhat1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		ArrayList<Person> data = new ArrayList<Person>();
		while (n-- > 0) {
			data.add(new Person(sc.nextLine().split(" ")));
		}
		Person eldest = data.get(0);
		Person youngest = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (!eldest.getDob().isBefore(data.get(i).getDob())) {
				eldest = data.get(i);
			}
			if (!youngest.getDob().isAfter(data.get(i).getDob())) {
				youngest = data.get(i);
			}
		}
		System.out.println(youngest);
		System.out.println(eldest);
	}
}

