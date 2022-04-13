package javacode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DesktopFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("Rajesh.txt");
		BufferedReader br = new BufferedReader(fr);
		try {
			String reader = br.readLine();
			while (reader != null) {
				System.out.println(reader);
				reader = br.readLine();
			}
		} catch (IOException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
