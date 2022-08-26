package studyJavaPTIT;

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

	public PhanSo reduce() {
		long x = gcd(ts, ms);
		PhanSo a = new PhanSo(ts / x, ms / x);
		return a;
	}

	public static PhanSo add(PhanSo a, PhanSo b) {
		PhanSo c = new PhanSo(a.getTs() * b.getMs() + a.getMs() * b.getTs(), a.getMs() * b.getMs());
		return c.reduce();
	}

	public static PhanSo mul(PhanSo a, PhanSo b) {
		PhanSo c = new PhanSo(a.getTs() * b.getTs(), a.getMs() * b.getMs());
		return c.reduce();
	}

}

public class TinhToanPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
			PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
			PhanSo c = PhanSo.add(a, b);
			PhanSo d = PhanSo.mul(c, c);
			System.out.println(d + " " + PhanSo.mul(d, PhanSo.mul(a, b)));
		}
	}

}