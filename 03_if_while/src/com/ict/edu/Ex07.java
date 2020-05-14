package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식 : 
		//		초기식
		//		while(조건식){
		//			조건식이 참일때 실행;
		//				증감식;
		//		}
		// while문이 끝을 만나면 무조건 조건식으로 가라.
		
		// 형식2 :
		//		초기식
		//		while(true){
		// 			if(빠져나갈 조건) break;
		//			조건식이 참일때 실행;
		//			증감식;
		//		}
		// while문이 끝을 만나면 무조건 조건식으로 가라.
	
		// 0 ~ 10 까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int k1 = 0;
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1++;
		}
		System.out.println();
		
		int k2 = 0;
		while (true) {
			if(k2 >= 11) break;
			System.out.print(k2 + " ");
			k2++;
		}
		System.out.println();
		
		// 0 - 10까지 짝수만 출력하기
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		System.out.println();
		
		// 0 - 10 까지 홀수만 출력
		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.print(k4 + " ");
			}
			k4++;
		}
		System.out.println();
		
		// 0 - 50 까지 7의 배수 출력
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}
		System.out.println();
		
		// a - g
		char c1 = 'a';
		while (c1 < 'h') {
			System.out.print(c1 + " ");
			c1++;
		}
		System.out.println();
		
		// 5단 출력
		int k6 = 1;
		while (k6 < 10) {
			System.out.print("5 * " + k6 + " = " + (5*k6) + " ");
			k6++;
		}
		System.out.println();
		
		// 0000
		// 0000
		// 0000
		// 0000
		int k7 = 1;
		while (k7 < 17) {
			System.out.print("0 ");
			if (k7 % 4 == 0) {
				System.out.println();
			}
			k7++;
		}
		System.out.println();
		
		// 숙제

		// 0 ~ 10 누적 합 (합계)
		
		// 0 ~ 10까지 홀수의 합계
		
		// 0 ~ 10까지 짝수의 합계
		
		// 0 ~ 10까지 홀수, 짝수의 합계
		
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		System.out.println();
	}
	
}
