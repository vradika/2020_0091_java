package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		
		// 사진, 동영상, 음악은 1byte씩 처리해야 한다.
		
		// 읽는 위치
		String pathname1 = "c:" + File.separator + "study" + File.separator + "util" + File.separator  +  "video.mp4";
		File file1 = new File(pathname1);
		
		// 쓰는 위치
		String pathname2 = "c:" + File.separator + "study" + File.separator + "util" + File.separator  +  "비디오.mp4";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while ((k=fis.read()) != -1) {
				fos.write(k);
			}
			fos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				System.out.println("수고하셨습니다.");
				if (fos != null) fos.close();
				if (fis != null) fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
