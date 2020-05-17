import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex07 {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return (double)a/b;
	}
	
	public static void output(int num, char c) {
		for (int i = 1; i <+ num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public static void compute(String item, int qty, int price) {
		System.out.println("품명: " + item);
		System.out.println("금액: " + (qty * price));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		// 문제 18: 다중 for문을 이용해서 모양을 만드시오
		
		int k;
		for (int i = -4; i <= 4; i++) {
			k = i < 0 ? -i : i;
			for (int j = k; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 9 - 2 * k; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = -2; i <= 2; i++) {
			k = i < 0 ? -i : i;
			for (int j = k; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5-2 * k; j++) {
				if (j == 1 || j == 5 - 2 * k) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 5) {
					System.out.print("*");
				} else if (j == 1 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 문제 19: main() 함수에서 각가 호출하고 계산된 결과를 return 받아서 main()에서 출력하시오
		System.out.println("더하기: " + sum(3, 5));
		System.out.println("빼  기: " + sub(7, 2));
		System.out.println("곱하기: " + mul(4, 5));
		System.out.printf("나누기: %.2f\n " , div(7, 3));
		
		// 문제 20: ouput(10, '#')함수를 호출하여 다음과 같이 출력 하시오
		//		조건) 출력문에서 for문을 이용하시오
		output(10, '#');
		System.out.println();
		
		// 문제 21: 값을 입력받아 함수 호출하여 처리하시오
		// 조건 1) 입력받은 값을 compute(item, qty, price)함수에서 처리
		// 조건 2) 계산 방법: 금액 = 수량 * 단가
		
		String item = null;
		int qty, price;
		
		System.out.println("품명: ");
		item = sc.next();
		System.out.println("수량: ");
		qty = sc.nextInt();
		System.out.println("단가: ");
		price = sc.nextInt();
		System.out.println();
		
		compute(item, qty, price);
	}
}
