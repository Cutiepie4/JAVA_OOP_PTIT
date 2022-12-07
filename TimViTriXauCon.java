package qlibanhang1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(new File("STRING.in"));
		int t = Integer.valueOf(sc.nextLine());

		while (t-- > 0) {
			String a = sc.nextLine(), b = sc.nextLine();

			int idx = 0;
			while (true) {
				int pos = a.indexOf(b, idx);
				if (pos == -1)
					break;
				else {
					System.out.print((pos + 1) + " ");
					idx = pos + 1;
				}
			}
			System.out.println();
		}
	}

}
