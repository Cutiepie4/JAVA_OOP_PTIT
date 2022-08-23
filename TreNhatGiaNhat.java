package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person {
	private String name;
	private int dd, mm, yy;

	public Person(String[] data) {
		super();
		this.name = data[0];
		String[] arr = data[1].split("/");
		dd = Integer.valueOf(arr[0]);
		mm = Integer.valueOf(arr[1]);
		yy = Integer.valueOf(arr[2]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class TreNhatGiaNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Person> data = new ArrayList<Person>();
		while (n-- > 0) {
			data.add(new Person(sc.nextLine().split(" ")));
		}
		Collections.sort(data, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getYy() > o2.getYy())
					return -1;
				else if (o1.getYy() == o2.getYy() && o1.getMm() > o2.getMm())
					return -1;
				else if (o1.getYy() == o2.getYy() && o1.getMm() == o2.getMm() && o1.getDd() > o2.getDd())
					return -1;
				return 1;
			}
		});
		System.out.println(data.get(0));
		System.out.println(data.get(data.size() - 1));
		
	}
}
