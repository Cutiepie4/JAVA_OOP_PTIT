package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HocSinh {
	private String name, id;
	private double score;
	private int rank;

	public HocSinh(int id, String name, double score) {
		super();
		if (id < 10)
			this.id = "HS0" + id;
		else
			this.id = "HS" + id;
		this.name = name;
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public String getOverall() {
		if (score < 5)
			return "Yeu";
		else if (score < 7)
			return "Trung Binh";
		else if (score < 9)
			return "Kha";
		return "Gioi";
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		HocSinh a = (HocSinh) obj;
		if (name == a.getName() && id == a.getId() && score == a.getScore()) {
			return true;
		}
		return false;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + getScore() + " " + getOverall() + " " + getRank();
	}

}

public class XepHangHocSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<HocSinh> data = new ArrayList<HocSinh>();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			data.add(new HocSinh(i, sc.nextLine(), sc.nextDouble()));
		}
		
		ArrayList<HocSinh> tmp = new ArrayList<HocSinh>(data);
		Collections.sort(tmp, new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				if (o1.getScore() > o2.getScore())
					return -1;
				return 1;
			}
		});
		
		tmp.get(0).setRank(1);
		for (int i = 1; i < tmp.size(); i++) {
			if (tmp.get(i).getScore() == tmp.get(i - 1).getScore()) {
				tmp.get(i).setRank(tmp.get(i - 1).getRank());
			} else
				tmp.get(i).setRank(i + 1);
		}

		for (HocSinh i : data) {
			for (HocSinh j : tmp) {
				if (i.equals(j)) {
					System.out.println(j);
				}
			}
		}
	}
}
