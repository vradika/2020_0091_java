package Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator +"JAVA.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			String str = "자바 점점 더 어려워 집니다.\n정신 차리지 않으면 순식간에 도태 됩니다.\n그리고 열심히 공부하세요!!";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
