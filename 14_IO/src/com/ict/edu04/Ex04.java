package com.ict.edu04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// BufferedReader : 속도향상, readLine() => 한 줄씩 읽는다. 더 이상 읽을 수 없을 때 null 된다.
public class Ex04 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO07.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 한 줄 읽기
			/*
			String msg = br.readLine();
			System.out.println(msg);
			*/
			
			// 전체 읽기
			String msg = null;
			String str = "";
			// String은 원래 누적해서 저장하지 않는 것이 좋다.
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				// 찍어보기
				// System.out.println(msg);
				
				// 저장하기
				// str = str + msg + "\n";
				// str = str.concat(msg + "\n");
				
				sb.append(msg + "\n");
			}
			// System.out.println(str);
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.out.println();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
