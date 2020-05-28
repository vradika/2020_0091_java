package Buffered;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Output {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "EX01.txt";
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
				String name = br.readLine();
				System.out.print("국어 >> ");
				int kor = Integer.parseInt(br.readLine());
				System.out.print("영어 >> ");
				int eng = Integer.parseInt(br.readLine());
				System.out.print("수학 >> ");
				int math = Integer.parseInt(br.readLine());
				
				VO vo = new VO(name, kor, eng, math);
				list.add(vo);
				
				System.out.println("계속 진행할까요? Y / N");
				String con = br.readLine();
				if (con.equalsIgnoreCase("n")) {
					System.out.println("수고 하셨습니다.");
					System.out.println("프로그램을 종료합니다.");
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
