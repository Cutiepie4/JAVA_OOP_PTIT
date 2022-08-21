package studyJavaPTIT;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TapTuRiengCuaHaiXau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			TreeSet<String> set1 = new TreeSet<String>();
			String s1 = sc.nextLine();
			StringTokenizer st1 = new StringTokenizer(s1);
			while(st1.hasMoreTokens()) {
				set1.add(st1.nextToken());
			}
			
			String s2 = sc.nextLine();
			StringTokenizer st2 = new StringTokenizer(s2);
			while(st2.hasMoreTokens()) {
				set1.remove(st2.nextToken());
			}
			for(String i:set1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
