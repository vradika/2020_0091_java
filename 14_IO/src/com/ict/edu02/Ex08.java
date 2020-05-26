package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex08 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO03.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		// 속도 향상을 위해 Buffer 사용 , 혼자서는 사용 못함
		BufferedInputStream bis = null;
		
		try {
			// 스트림 체인 방식
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			// int m = bis.read();
			// System.out.println(m + ":" + (char)(m));
			
			// 파일의 모든 내용 읽기 : 
			// 1. while
			/*
			int m = 0;
			while ((m = bis.read()) != -1) {
				System.out.println((char)(m));
			}
			*/
			
			// 2. 배열
			/*byte[] b = new byte[(int)file.length()];
			bis.read(b);
			for (byte k : b) {
				System.out.print((char)(k));
			}
			*/
			
			// 2. String
			byte[] b = new byte[(int)file.length()];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				if (bis != null) bis.close();
				if (fis != null) fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
