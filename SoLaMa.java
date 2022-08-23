package studyJavaPTIT;

import java.util.HashMap;
import java.util.Scanner;

public class SoLaMa {
	public static String[] key = { "I", "V", "X", "L", "C", "D", "M", "IV", "IX", "XL", "XC", "CD", "CM" };
	public static int[] value = { 1, 5, 10, 50, 100, 500, 1000, 4, 9, 40, 90, 400, 900 };

	public static void main(String[] args) {
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		for (int i = 0; i < key.length; i++) {
			data.put(key[i], value[i]);
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int ans = 0;
			String s = sc.next();
			char[] arr = s.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 1) {
					String tmp = String.valueOf(arr[i]) + String.valueOf(arr[i + 1]);
					if (data.containsKey(tmp)) {
						ans += data.get(tmp);
						i++;
						continue;
					}
				}
				ans += data.get(String.valueOf(arr[i]));
			}
			System.out.println(ans);
		}
	}
}
