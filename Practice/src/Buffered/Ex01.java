package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Date d = null;
		
		try {
			// "ReadFile.txt" 파일을 읽는 FileReader 객체 생성
			// BufferedReader 객체 생성
			fr = new FileReader("ReadFile.txt");
			br = new BufferedReader(fr);
			
			// FileWriter로 파일 "CopyFile.txt"에 출력한다. 기존 파일에 덮어쓴다.
			// BufferedWriter 객체 생성
			fw = new FileWriter("CopyFile.txt", false);
			bw = new BufferedWriter(fw);
			
			String s = null;
			d = new Date();
			long end = d.getTime();
			
			// 파일 복사 시작 시간
			long start = d.getTime();
			
			while ((s=br.readLine()) != null) {
				bw.write(s);
				bw.newLine();
				
				System.out.println("복사 시간 : " + (end - start));
				
			}
			
		} catch (Exception e) {
			
		} finally {
			if (br != null) try { br.close(); } catch (Exception e2) {	}	
			if (fr != null) try { fr.close(); } catch (Exception e3) {	}
			if (bw != null) try { bw.close(); } catch (Exception e2) {  }
			if (fw != null)	try { fw.close(); } catch (Exception e2) { 	}
		}
	}
}