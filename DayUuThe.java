package studyJavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class DayUuThe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			String[] arrs = s.split(" ");
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int cntOdd = 0, cntEven = 0;
			for (int i = 0; i < arrs.length; i++) {
				arr.add(Integer.valueOf(arrs[i]));
				if (arr.get(i) % 2 == 0)
					cntEven++;
				else
					cntOdd++;
			}
			if ((cntEven > cntOdd && arr.size() % 2 == 0) || (cntEven < cntOdd && arr.size() % 2 == 1)) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
	}
}
