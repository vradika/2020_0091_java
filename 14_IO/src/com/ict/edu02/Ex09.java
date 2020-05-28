package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		String pathname1 = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		File file1 = new File(pathname1);
		String pathname2 = "c:" + File.separator + "study" + File.separator + "videocopy.mp4"; 
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);		
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int k = 0;
			while ((k=bis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				System.out.println("고쿠로사마 데시다!!");
				if (bos != null) bos.close();
				if (fos != null) fos.close();
				if (bis != null) bis.close();				
				if (fis != null) fis.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
