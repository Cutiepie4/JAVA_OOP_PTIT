package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DonHang {
	private String name, id, ord;
	private long count, unitPrice;

	public DonHang(String name, String id, long unitPrice, long count) {
		super();
		this.name = name;
		this.id = id;
		this.ord = id.substring(1, 4);
		this.unitPrice = unitPrice;
		this.count = count;
	}

	public String getOrder() {
		return id.substring(1);
	}

	public long getPrice() {
		return count * unitPrice;
	}

	public long getDiscountPrice() {
		if (id.substring(4, 5).equals("1")) {
			return getPrice() * 50 / 100;
		}
		return getPrice() * 30 / 100;
	}

	@Override
	public String toString() {
		return name + " " + id + " " + ord + " " + getDiscountPrice() + " " + (getPrice() - getDiscountPrice());
	}

}

public class SapXepDonHang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<DonHang> data = new ArrayList<DonHang>();
		int n = Integer.valueOf(sc.nextLine());

		while (n-- > 0) {
			data.add(new DonHang(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()),
					Integer.valueOf(sc.nextLine())));
		}
		Collections.sort(data, new Comparator<DonHang>() {

			@Override
			public int compare(DonHang o1, DonHang o2) {
				return o1.getOrder().compareTo(o2.getOrder());
			}
		});
		for (DonHang i : data) {
			System.out.println(i);
		}
	}
}
