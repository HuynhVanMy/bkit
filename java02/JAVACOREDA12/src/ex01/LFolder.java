package ex01;

import java.io.File;

public class LFolder {

	public static void main(String[] args) {
		// create a new folder
		File file = new File("D:/hocvien/LeVanNam");
		if (!file.isDirectory()) {
			try {
				file.mkdir();
				System.out.println("Sucess");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("folder is exist");
		}

	}

}