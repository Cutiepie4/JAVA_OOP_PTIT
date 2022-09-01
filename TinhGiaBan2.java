package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
	private String id, name, unit;
	private int inPrice, num;

	public MatHang(int id, String name, String unit, int inPrice, int num) {
		super();
		if (id < 10)
			this.id = "MH0" + id;
		else
			this.id = "MH" + id;
		this.name = name;
		this.unit = unit;
		this.inPrice = inPrice;
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getUnit() {
		return unit;
	}

	public int getInPrice() {
		return inPrice;
	}

	public int getNum() {
		return num;
	}

	public int getDeliverPrice() {
		return Math.round(inPrice * num * 5 / 100);
	}

	public int getPrice() {
		return Math.round(inPrice * num + getDeliverPrice());
	}

	public long getOutPrice() {
		return Math.round((double) getPrice() / 100 * 102 / num);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + unit + " " + getDeliverPrice() + " " + getPrice() + " "
				+ (int) (Math.ceil((double)getOutPrice() / 100) * 100);
	}

}

public class TinhGiaBan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<MatHang> data = new ArrayList<MatHang>();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			data.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(data, new Comparator<MatHang>() {

			@Override
			public int compare(MatHang o1, MatHang o2) {
				if (o1.getOutPrice() > o2.getOutPrice())
					return -1;
				return 1;
			}
		});

		for (MatHang i : data) {
			System.out.println(i);
		}
	}

}
