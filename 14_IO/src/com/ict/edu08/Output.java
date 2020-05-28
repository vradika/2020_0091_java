package com.ict.edu08;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO11.txt";
		File file = new File(pathname);
				
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<VO> list = new ArrayList<VO>();
			
			for (int i = 0; i < 5; i++) {
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("국어 >> ");
				int kor = sc.nextInt();
				System.out.print("영어 >> ");
				int eng = sc.nextInt();
				System.out.print("수학 >> ");
				int math = sc.nextInt();
				
				VO vo1 = new VO(name, kor, eng, math);
				VO vo2 = new VO(name, kor, eng, math);
				VO vo3 = new VO(name, kor, eng, math);
				VO vo4 = new VO(name, kor, eng, math);
				VO vo5 = new VO(name, kor, eng, math);
				
				list.add(vo1);
				list.add(vo2);
				list.add(vo3);
				list.add(vo4);
				list.add(vo5);
				
				oos.writeObject(list);
				oos.flush();
			}			
		} catch (Exception e) {
			
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		} 
		
		
	}
}

