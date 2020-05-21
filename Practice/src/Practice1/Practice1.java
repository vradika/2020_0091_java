package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		
		// 문제 7. BufferedReader를 이용하여 입력받아 두개의 수 중 큰 수를 출력하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;
		int b = 0;
		
		System.out.print("A >> "); a = Integer.parseInt(br.readLine());
		System.out.print("B >> "); b = Integer.parseInt(br.readLine());
		
		System.out.println("큰 수 >> " + (a > b ? a : b));
	}
}
