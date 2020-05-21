import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex001 extends Ex001_1{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		String subject;
		int age;
		
		System.out.print("이름 >> "); name = br.readLine();
		System.out.print("나이 >> "); Integer.parseInt(br.readLine());
		System.out.print("과목 >> "); subject = br.readLine();
	}
}
