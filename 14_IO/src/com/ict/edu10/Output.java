package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO14.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<VO> list = new ArrayList<VO>();
			while (true) {
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("국어 >> ");
				int kor = sc.nextInt();
				System.out.print("영어 >> ");
				int eng = sc.nextInt();
				System.out.print("수학 >> ");
				int math = sc.nextInt();
				
				VO vo = new VO(name, kor, eng, math);
				list.add(vo);
				
				System.out.println("계속 진행 할까요? Y / N");
				String con = "";
				con = sc.next();
				if (con.equalsIgnoreCase("n")) {
					System.out.println("수고하셨습니다."); 
					break;
				}
			}
			oos.writeObject(list);
			oos.flush();
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
