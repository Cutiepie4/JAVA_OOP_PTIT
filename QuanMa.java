package danhsachsinhvien1;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Coordinate {
	public static String ROW = "abcdefgh";
	public int row, col;

	public Coordinate(String s) {
		this.row = ROW.indexOf(s.charAt(0));
		this.col = Integer.valueOf(String.valueOf(s.charAt(1))) - 1;
	}

	public Coordinate(int row, int col) {
		this.row = row;
		this.col = col;
	}

	@Override
	public boolean equals(Object obj) {
		Coordinate a = (Coordinate) obj;
		if (this.row == a.row && this.col == a.col) {
			return true;
		}
		return false;
	}

}

class Pair {
	public Coordinate coordinate;
	public int step;

	public Pair(Coordinate coordinate, int step) {
		super();
		this.coordinate = coordinate;
		this.step = step;
	}

}

public class Main {

	public static int X[] = { 1, 2, -1, 2, 1, -2, -1, -2 };
	public static int Y[] = { 2, 1, 2, -1, -2, 1, -2, -1 };

	public static int countStep(Coordinate st, Coordinate en) {
		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(st, 0));

		boolean[][] mark = new boolean[8][8];

		while (!queue.isEmpty()) {
			Pair current = queue.poll();

			if (current.coordinate.equals(en)) {
				return current.step;
			}

			for (int i = 0; i < 8; i++) {
				int x = current.coordinate.row + X[i];
				int y = current.coordinate.col + Y[i];

				if (x >= 0 && y >= 0 && x < 8 && y < 8 && !mark[x][y]) {
					queue.offer(new Pair(new Coordinate(x, y), current.step + 1));
					mark[x][y] = true;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			Coordinate st = new Coordinate(sc.next()), en = new Coordinate(sc.next());
			System.out.println(countStep(st, en));
		}
	}
}
