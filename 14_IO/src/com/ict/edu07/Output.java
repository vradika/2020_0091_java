package com.ict.edu07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.ict.edu07.VO;

public class Output {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "IO10.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 여러개의 객체 정보 담아 보자
			
			VO vo1 = new VO("고길동", 34, 70.4, true);
			VO vo2 = new VO("마이콜", 25, 60.4, false);
			VO vo3 = new VO("둘리", 10000, 1000.4, true);
			VO vo4 = new VO("희동이", 4, 13.4, true);
			VO vo5 = new VO("도우너", 20, 100.4, false);
			
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			// 객체 직렬화
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

