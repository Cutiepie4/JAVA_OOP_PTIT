package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
	public static long[] data = new long[46];

	public static long cal(ArrayList<Integer> arr) {
		long ans = 1;
		for (int i : arr) {
			ans *= i;
		}
		return ans;
	}

	public static ArrayList<Integer> analyze(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				arr.add(i);
				n /= i;
			}
			if (n == 1)
				break;
		}
		if (n > 1)
			arr.add(n);
		return arr;
	}

	public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] cntA = new int[46];
		int[] cntB = new int[46];

		for (int i : a) {
			cntA[i]++;
		}
		for (int i : b) {
			cntB[i]++;
		}
		for (int i = 0; i < 46; i++) {
			cntA[i] = Math.max(cntA[i], cntB[i]);
			while (cntA[i]-- > 0) {
				arr.add(i);
			}
		}
		return arr;
	}

	public static void init() {
		data[1] = 1;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		for (int i = 2; i < 46; i++) {
			ArrayList<Integer> tmp = analyze(i);
			arr = union(arr, tmp);
			data[i] = cal(arr);
		}
	}

	public static void main(String[] args) {
		init();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(data[n]);
		}
	}
}
