package com.ict.edu;

public class Ex02 {
	public static void main(String[]args) {
		// if ~ else ~ : 조전식이 참일 때와 거짓일 때 각각 나눠서 실행한다.
		// 형식 : if(조건식){
		// 				조건식이 참일 때 실행 문장;
		// 				조건식이 참일 때 실행 문장;
		//			} else {
		//				조건식이 거짓일 때 실행 문장;
		//				조건식이 거짓일 때 실행 문장;
		
		// int k1 이 60 이상이면 합격, 나머지 불합격
		int k1 = 99;
		String res ="";
		if (k1 >= 60) {
			res = "합격";
		} else {
			res = "불합격";
		}
		System.out.println("결과: " + res);
		
		// 홀수 짝수 판별
		int k2 = 42;
		if (k2 % 2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
		}
		System.out.println("결과: " + res);
		
		// 대문자, 소문자 판별
		char k3 = 'q';
		if (k3 >= 'a' && k3 <= 'z') {
			res = "소문자";
		} else {
			res = "대문자";
		}
		System.out.println("결과: " + res);
		
		// 1 또는 3이면 남자, 아니면 여자
		int k4 = 2;
		if (k4 == 1 || k4 == 3) {
			res = "남자";
		} else {
			res = "여자";
		}
		System.out.println("결과: " + res);
		
		// 근무시간이 8시간까지는 시간당 8590이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		// 현재 근무한 시간이 10이다. 
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 8590;
		int pay = 0;
		if (time > 8) {
			pay = (8 * dan) +(int)((time-8) * dan *1.5);
		} else {
			pay = time * dan;
		}
		System.out.println("결과: " + pay);
		
		// 두 수 중 큰 값을 출력하시오.
		int k5 = 42;
		int k6 = 52;
		int result = 0;
		if (k5 > k6) {
			result = k5;
		} else {
			result = k6;
		}
		System.out.println("결과: " + result);
		System.out.println();
	}
}
