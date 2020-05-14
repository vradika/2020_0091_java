package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 숫자를 받아서 홀수, 짝수를 구분하자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력: ");		
		int su = sc.nextInt();
		String result = "";
		if (su % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("결과: " + result);
		System.out.println("================================");
		
		//나라를 입력하면 수도가 출력되게 하자
		// 1. 한국=서울, 2. 중국=베이징, 3.일본=도쿄, 나머지는 데이터 없음
		System.out.println("나라입력: 1.한국, 2.중국, 3.일본 >> ");
		int num = sc.nextInt();
			result = "";
		if (num == 1) {
			result = "서울";
		} else if (num == 2) {
			result = "베이징";
		} else if (num == 3) {
			result = "도쿄";
		} else {
			result = "데이터 없음";
		}
		System.out.println(result);
		System.out.println("================================");
		
		//나라를 입력하면 수도가 출력되게 하자
		// 1. 한국=서울, 2. 중국=베이징, 3.일본=도쿄, 나머지는 데이터 없음
		System.out.println("나라입력: 한국, 중국, 일본 >> ");
		String country = sc.next();
		result = "";
		switch (country) {
		case "한국" : result = "서울"; break;
		case "중국" : result = "베이징"; break;
		case "일본" : result = "도쿄"; break;
		default: result = "데이터 없음";
		}	
		System.out.println(result);
		System.out.println("================================");
		
		// 근무시간이 8시간까지는 시간당 8590
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 근무시간을 입력해서 알바금액을 산정하자.
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int dan = 8590;
		int pay = 0;
		if (time < 8) {
			pay = time * dan;
		} else {
			pay = (8 * dan) +(int)((time - 8) * dan * 1.5);
		}
		System.out.println("산정 금액: " + pay);
		System.out.println("================================");
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 5이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다.
		// 메뉴를 고른 결과와 잔돈을 출력 (단, 부가세 10% 포함)
		System.out.println("메뉴 번호: \n1.카페모카(3500), \n2.카페라떼(4000), \n3.아메리카노(3000), \n4.과일쥬스(3500) >> ");
		int menu = sc.nextInt();
		String drink = "";
		dan = 0;
		su = 2;
		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else {
			drink = "과일쥬스";
			dan = 3500;
		}
		int total = dan * su;
		int input = 10000;
		int vat = (int)(total*0.1);
		int output = input - (total+vat);
		
		System.out.println("남은금액: " + output);
		
		
	}
}
