import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int su2 = 0;
		int su3 = 0;
		double per = 0.0;
		
		for (int i = 0; i < 10; i++) {
			int su = ran.nextInt(10) + 1;
			if (su % 2 == 0) {
				su2 = 1;
			} else {
				su2 = 0;
			}
			System.out.println("1. 높음 <<<*>>> 2. 낮음");
			su3 = sc.nextInt();
			
			if (su3 == su2) {
				System.out.println("승!!");
				result++;
			} else {
				System.out.println("패!!");
			}		
		}
		per = (result/5.0) * 100;
		System.out.println("승 >> " + result);
		System.out.println("승률 >> " + per + "%");
	}
}
