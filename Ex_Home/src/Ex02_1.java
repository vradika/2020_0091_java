import java.util.Random;
import java.util.Scanner;

public class Ex02_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int result = 0;
		int su2 = 0;
		int su3 = 0;
		double per = 0.0;
		
		esc: while (true) {
			System.out.println("높음 낮음 게임! <*> Start <*>");
			int su = ran.nextInt(10)+1;
			
			if (su % 2 == 0) {
				su2 = 1;
			} else {
				su2 = 0;
			}
			System.out.println("1.높음 <<<*>>> 2.낮음");
			su3 = sc.nextInt();
			
			if (su3 == su2) {
				System.out.println("승!!");
				result++;
			} else {
				System.out.println("패!!");
			}
			cnt++;
			while (true) {
				int con = 0;
				System.out.println("1.다음게임 <<<*>>> 2.종료");
				con = sc.nextInt();
				if (con == 1) {
					continue esc;
				} else if(con == 2){
					break esc;
				} else {
					System.out.println("잘못 누르셨습니다.");
					continue;
				}
			}
		}
		per = (cnt/5.0) * 10;
		System.out.println("승 >> " + result);
		System.out.println("승률 >> " + per + "%");
	}
}
