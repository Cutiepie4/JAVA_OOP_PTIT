package oopPakage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Counter implements Comparable<Counter> {
	private String data;
	private int count;

	public Counter(String data, int count) {
		super();
		this.data = data;
		this.count = count;
	}

	@Override
	public int compareTo(Counter o) {
		if (this.count > o.count) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return data + " " + count;
	}

}

public class Main {
	public static boolean check(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedHashMap<String, Integer> data = new LinkedHashMap<>();

		while (sc.hasNext()) {
			String s = sc.next();
			if (check(s)) {
				if (!data.containsKey(s)) {
					data.put(s, 0);
				}
				data.put(s, data.get(s) + 1);
			}
		}

		ArrayList<Counter> sortData = new ArrayList<>();

		for (String i : data.keySet()) {
			sortData.add(new Counter(i, data.get(i)));
		}

		Collections.sort(sortData);

		for (Counter i : sortData) {
			System.out.println(i);
		}
	}
}
