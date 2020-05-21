package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		
		int cnt, result, su2, su3, con;
		double per;
		cnt = 0;
		result = 0;
		esc: while (true) {
			System.out.println("<∧>높음! <∧>게임!<∨> 낮음!<∨>");
			System.out.println();
			int su = ran.nextInt(100000) + 1;
			
			if (su % 2 == 0) {
				su2 = 1;
			} else {
				su2 = 0;
			}
			System.out.println("1. 높음 <<<*>>> 2. 낮음");
			su3 = Integer.parseInt(br.readLine());
		
			if (su3 == su2) {
				System.out.println("승!");
				result++;
			} else {
				System.out.println("패!");
			}
			cnt++;
			while (true) {
				System.out.println();
				System.out.println("1.진행 <<<*>>> 2. 종료");
				con = Integer.parseInt(br.readLine());
				
				if (con == 1) {
					continue esc;
				} else if (con == 2) {
					break esc;
				} else {
					System.out.println();
					System.out.println("잘못 눌렀습니다.");
					continue;
				}
			}			
		}
		per = (result/5.0) * 10;
		System.out.println("승 >> " + result);
		System.out.println("승률 >> " + per + "%");
		System.out.println("수고하셨습니다!!");
	}
}
