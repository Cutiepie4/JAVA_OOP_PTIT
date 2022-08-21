package studyJavaPTIT;

import java.util.Scanner;

class Phanso {
	private long ts, ms;

	public void input() {
		Scanner sc = new Scanner(System.in);
		this.ts = sc.nextLong();
		this.ms = sc.nextLong();
		sc.close();
	}
	
	public static long ucln(long a, long b) {
		if (b == 0)
			return a;
		return ucln(b, a % b);
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public long getMs() {
		return ms;
	}

	public void setMs(long ms) {
		this.ms = ms;
	}

	public void reduce() {
		long x = ucln(ts, ms);
		ts /= x;
		ms /= x;
	}
	
	public void display() {
		System.out.println(ts + "/" + ms);
	}
}

public class PhanSo {

	public static void main(String[] args) {
		Phanso a = new Phanso();
		a.input();
		a.reduce();
		a.display();
	}
}
