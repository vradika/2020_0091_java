package com.ict.edu;

public class Ex05 {
		
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for(초기식; 조건식; 증감식){
		//		조건식이 참일때 실행할 문장;					
		//	}
		// for문은 무조건 초기식 부터 시작한다. 조건식으로 이동
		// 조건식은  boolean형(boolean, 비교연산, 논리연산)
		// 조건식이 참이면 for문 안쪽 블록을 실행한다.
		// 조건식이 거짓이면 for문을 실행하지 않는다.
		// for문의 끝을 만나면 무조건 증감식으로 간다.
		// 증감식은 초기식의 값을 증가하거나 감소시키는 역할을 하고, 다시 조건식으로 간다.
		
		// 자바에서는 if문, switch문, for문 안에 만든 변수는 밖에서 사용할 수 없다.
		
		// 안녕하세요 10번 출력하기
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("==========================");
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		}
		System.out.println("==========================");
		
		// 0 부터 - 10까지 출력하기
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("==========================");
		
		// 0 - 10까지 짝수만 출력하기
		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("==========================");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("==========================");
		
		// 0 - 10 까지 홀수만 출력
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("==========================");
		
		// 0 - 50 까지 7의 배수 출력
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				// 출력 후 한 줄 띄우기
				System.out.println(i);
			}
		}
		System.out.println("==========================");
	
		// a - g
		for (char i = 'a'; i < 'h'; i++) {
			// 옆으로 출력하기, \t눈 tab을 의미
			System.out.print(i + "\t");
		}
		// \n 은 한 줄 띄우기
		System.out.print("가나\n다라");
		// 한 줄 띄우기
		System.out.println();
		// 존재하지 않는 메소드
		//System.out.print();
		
		// System.out.println(); : 줄 바꾸기
		// System.out.print(); : 존재하지 않음
		// System.out.println(변수나 데이터); : 출력 후 줄 바꾸기
		// System.out.print(변수나 데이터); : 옆으로 출력하기
		// \t : 일정 간격 띄우기, \n : 줄 바꿈
		
		// 5단 출력
		System.out.println("==========================");
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		// System.out.println("0000\n0000\n0000\n0000");
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");
		}
		
		System.out.println();
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		// 0 ~10 누적 합 (합계)
		int sum = 0; // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i; // i의 누적합
		}
		System.out.println("누적합 : " + sum);
		// 0 ~ 10까지 홀수의 합계
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			}
		}
		System.out.println("홀수의 합: " + odd);
		
		// 0 ~ 10까지 짝수의 합계
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 합: " + even);
		
		// 0 ~ 10까지 홀수, 짝수의 합계
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("짝수의 합 : " + even + "\t" + "홀수의 합: " + odd);
				
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("7!: " + sum);
		System.out.println();
	}

}
