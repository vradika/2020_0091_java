package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 문자스트림 : 모든 처리를 2byte씩 처리
// 		 대상 : 세계 모든 언어로 구성된 문서파일을 출력할 때 적합
// 최상위 클래스 : Reader(입력), Writer(출력)

// FileOutputStream : 1byte 처리, writer(int), writer(byte[] b)
// FileWriter	 	: 2byte 처리, writer(int), writer(char[] b), writer(String str)
public class Ex01 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO06.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		// 처리 속도 향상을 위해서 BufferedWriter도 함께 사용
		// BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			// 숫자
			fw.write(97);
			// 숫자대신 char
			fw.write('C');
			
			char[] c = {'J','A','V','A'};
			fw.write(c);
			
			// String
			fw.write("korea\n");
			fw.write("대한민국\n");
			fw.write("大韓\n");
			fw.write("12345\n");
			fw.flush();
			
		} catch (Exception e) {
			
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
