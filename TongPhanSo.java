package studyJava;

import java.util.Scanner;

class PhanSo {
	private long ts, ms;

	public PhanSo() {
		super();

	}

	public PhanSo(long ts, long ms) {
		super();
		this.ts = ts;
		this.ms = ms;
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

	@Override
	public String toString() {
		return ts + "/" + ms;
	}

	public long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public void reduce() {
		long x = gcd(ts, ms);
		ts /= x;
		ms /= x;
	}

	public static PhanSo add(PhanSo a, PhanSo b) {
		a.setTs(a.getTs() * b.getMs());
		b.setTs(a.getMs() * b.getTs());
		PhanSo c = new PhanSo(a.getTs() + b.getTs(), a.getMs() * b.getMs());
		c.reduce();
		return c;
	}

}

public class TongPhanSo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
		PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
		System.out.println(PhanSo.add(a, b));
	}

}