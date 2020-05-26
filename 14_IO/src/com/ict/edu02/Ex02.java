package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 스트림 : 모든 처리를 1byte씩 처리
// 			대상 : byte로 이루어진 모든 파일(그림, 영문자, 숫자, 소리, 동영상)
// 최상위 클래스 : InputStream입력), OutputStream(출력)

// FileOutputStream 주요메소드
// 1. write(int b) : int b => 아스키 코드(숫자) 하나 쓸 수 있다. = > 한글자 쓰기
//				     int b 대신 char 하나를 쓸 수 있다. (영문 대소문자, 숫자, 일부 특수 문자) 쓰기 가능
// 				     영어를 제외한 나머지 글자는 사용 불가.
// 2. write(byte[] b) : byte[]를 사용할 수 있다.
// 	  flush() : wite 후 반드시 사용
//    close() : open 된 스트림을 닫기 (finally로 처리)
public class Ex02 {
	
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// 해당 파일이 없으면 만들어지고, 있으면 만들지 않는다.
			// 덮어쓰기 된다.
		fos = new FileOutputStream(file);
			
		// 이어쓰기
		//fos = new FileOutputStream(file, true);
		fos.write(97); // a
		fos.write(65); // A
		fos.write(97); // a
		
		// 숫자 대신에 char사용
		fos.write('J');
		fos.write('A');
		fos.write('V');
		fos.write('A');
		
		// 줄 변경하기
		fos.write(13);
		fos.write(10);
		
		// 배열을 이용하자
		byte[] b = {'b', 'o', 'y', 's', 13, 10, 'g', 'i', 'r', 'l', 's', 13, 10};
		fos.write(b);
		
		// String을 이용하자 : 비영어도 사용 가능
		String str = "Hello\n안녕\n123\n大韓\nWorld";
		// 내용을 byte[]에 넣었다.
		byte[] b2 = str.getBytes();
		fos.write(b2);
		
		fos.flush();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
