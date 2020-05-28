package com.ict.edu07;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.ict.edu07.VO;

// ObjectInputStream : 객체 입력 스트림, 바이트스트림
// readObject() => 역직렬화 메소드
// 받아서 읽는다. Input, VO 클래스가 필요하다.
public class Input {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO10.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			for (VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getWeigth() + "\t");
				System.out.println(k.isGender());
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
