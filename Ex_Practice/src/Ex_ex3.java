import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex_ex3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// 문제 13: 년도를 입력받아 윤년/평년 구하기
		// 조건:	1) 년도를 4로 나누어 떨어져야 함
		//			2) 년도를 100으로 나누어 떨어지지 않거나
		//			   년도를 400으로 나누어 떨어져야 함
		// (참고) 4(윤년), 100(평년), 400(윤년)
		System.out.print("년도를 입력하세요 >> ");
		int year = sc.nextInt();
		if (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)) {
			System.out.println("평년");
		} else {
			System.out.println("윤년");
		}
		
		// 문제 14: 50개의 난수를 만들어서 다음과 같이 출력하시오
		// 조건:	1) 0 ~ 100 사이의 수 일것
		//			2) 1줄에 6개씩 표시하시오
		int num;
		int sum = 0;
		for (int i = 0; i <+ 50; i++) {
			num = new Random().nextInt(101);
			System.out.print(num + "\t");
			sum += num;
			if (i % 6 == 0) 
				System.out.println();
		}
		System.out.println("\n합 >> " + sum);
		
		// 문제 15: 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
		//		난수발생: 1. int a=(int(Math.Rabdom()*100: 0 ~ 99 사이의 난수
		//				  2. 1) import java.util.Random;
		//					 2) Random 변수1 = new Random();
		//					 3) int 변수2 = 변수1.nextInt();
		//					 	>> 0 ~ (최대값 - 1) 사이의 임의의 수
		int a = (int)(Math.random()  *100);
		int num1, cnt = 0;
		while (true) {
			System.out.print("숫자 입력 >> "); num1 = Integer.parseInt(br.readLine());
			cnt++;
			if (num1 > a) {
				System.out.println("컴퓨터의 숫자가 더 작습니다 >> \n");
			} else if (num1 < a) {
				System.out.println("컴퓨터의 숫자가 더 큽니다 >> \n");
			} else {
				
			}
			System.out.println("축하합니다!" + cnt + "번 만에 맞추셨습니다!");
			break;
		}
		
		// 문제 16: 1 ~ 100 사이의 수 중에서 3의 배수이면서 7의 배수 구하기
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
		// 문제 17: for문을 이용하여 제곱승을 구하시오
		int x,y;
		int result = 1;
		System.out.print("x의 값을 입력 >> "); x = Integer.parseInt(br.readLine());
		System.out.print("y의 값을 입력 >> "); y = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		System.out.println(x + "의" + y + "제곱은" + result);
	}
}
