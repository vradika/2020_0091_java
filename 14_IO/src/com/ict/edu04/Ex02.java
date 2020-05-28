package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// BufferedWriter : 속도 향상과 줄바꿈 메소드가 존재한다.
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO07.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		// 처리 속도 향상을 위해서 BufferedWriter도 함께 사용
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// 숫자
			bw.write(97);
			bw.newLine();
			// 숫자대신 char
			bw.write('C');
			bw.newLine();
			
			char[] c = {'J','A','V','A'};
			bw.write(c);
			bw.newLine();
			
			// String : 줄바꿈 메소드 => newLine()
			bw.write("korea");
			bw.newLine();
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			bw.write("12345");
			bw.flush();
			
		} catch (Exception e) {
			
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}
	}

