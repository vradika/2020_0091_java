package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			String str = "Phone: 010 - 5555 - 77777\n이름: 서준수\nAge: 32";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if (fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
