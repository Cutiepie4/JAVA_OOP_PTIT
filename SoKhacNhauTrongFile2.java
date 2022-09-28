package studyJavaPTIT;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SoKhacNhauTrongFile2 {
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
		int[] data = new int[1001];

		for (int i = 0; i < 100000; i++) {
			data[input.readInt()]++;
		}

		for (int i = 0; i < 1000; i++) {
			if (data[i] > 0) {
				System.out.println(i + " " + data[i]);
			}
		}
		input.close();
	}
}