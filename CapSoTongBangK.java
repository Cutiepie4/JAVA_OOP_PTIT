package studyJavaPTIT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CapSoTongBangK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			HashMap<Long, Long> data = new HashMap<>();
			HashSet<Long> arr = new HashSet<>();

			long n = sc.nextLong(), k = sc.nextLong();

			for (int i = 0; i < n; i++) {
				long x = sc.nextLong();
				arr.add(x);
				if (data.containsKey(x)) {
					data.put(x, data.get(x) + 1);
					
				} else
					data.put(x, (long) 1);
			}

			long cnt = 0;

			for (Long i : arr) {
				if (k - i != i && data.containsKey(k - i)) {
					cnt += data.get(i) * data.get(k - i);
				}
			}

			cnt /= 2;

			if (k % 2 == 0 && data.containsKey(k / 2)) {
				cnt += data.get(k / 2) * (data.get(k / 2) - 1) / 2;
			}
			
			System.out.println(cnt);
		}

	}
}
