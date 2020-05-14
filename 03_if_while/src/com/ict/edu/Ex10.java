package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록을 탈출할 때 사용하는 예약어
		// continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
		//				(continue문 이하 수행문을 포기하고 바로 증감식으로 간다.)
		// break, continue 둘다 보통 if문과 함께 사용된다.
		
		// 1 ~ 10 까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// i가 6알 때 break;
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// i가 6일 때 continue;
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// 0 ~ 10까지 짝수 출력
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
		// 짝수를 출력하자는 말은 홀수는 출력하지 말자
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) continue;
			System.out.print(i + "\t");
		}
		System.out.println();
		
	}
}
