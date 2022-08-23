package studyJavaPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFileVanBan {

	public static void main(String[] args) throws FileNotFoundException {

			File input = new File("DATA.in");
			Scanner sc = new Scanner(input);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 

}
