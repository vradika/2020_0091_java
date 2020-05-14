package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~ case : if문과 같이 조건문
		// if문은 조건식이 boolean형이다. 즉 비교연산, 논리연산, boolean형 사용.
		// switch문은 인자값이 byte, short, int, char, String일때 사용.
		// switch(인자값){
		//		case 조건값1 : 인자값과 조건값 1 같을 때 수행할 문장; break;
		//		case 조건값2 : 인자값과 조건값 2 같을 때 수행할 문장; break;
		//		case 조건값3 : 인자값과 조건값 3 같을 때 수행할 문장; break;
		//		default : 조건값 1, 2, 3 모두 같지 않을 때 수행할 문장;
		// }
		// break 가 없으면 break를 만날 때까지 모든 실행 문을 실행.
		// break 역할은 현재 실행하고 있는 범위를 벗어나는 역할
		
		// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 대한민국
		char k1 = 'K';
		String res = "";

		switch (k1) {
		case 'A' : res = "아프리카"; break;
		case 'B' : res ="브라질"; break;
		case 'C' : res = "캐나다"; break;
		default: res = "대한민국";
		}
		System.out.println("결과: " + res);
		// char k2이 A, a이면 아프리카, B, b이면 브라질, C, c이면 캐나다 나머지 대한민국
		char k2 = 'k';
		
		switch (k2) {
		case 'A' : 
		case 'a' : res = "아프리카"; break;
		case 'B' : 
		case 'b' : res = "브라질"; break;
		case 'C' : 
		case 'c' : res = "캐나다"; break;
		default: res = "대한민국";
		}
		System.out.println("결과: " + res);
		
		// int k3가 1 또는 3이면 남자, 2 또는 4이면 여자
		int k3 = 4;
		
		switch (k3) {
		case 1 :
		case 3 : res = "남자"; break;
		case 2 :
		case 4 : res = "여자"; break;
		}
		System.out.println("결과: " + res);
		
		// String k4 한국이면 서울, 중국이면 북경, 일본이면 동경, 미국이면 워싱턴
		String k4 = "일본";
				
		switch (k4) {
		case "중국" : res = "북경"; break;
		case "일본" : res = "동경"; break;
		case "미국" : res = "워싱턴"; break;
		case "한국" : res = "서울"; break;
		}
		System.out.println("결과: " + res);
		
		// switch문은 범위가 넓어지면 사용하지 말자 (if문 사용하자)		
		// int k5의 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F
		
		int k5 = 95;
		switch ((int)(k5/10)) {
		case 10 :
		case 9 : res = "A"; break;
		case 8 : res = "B"; break;
		case 7 : res = "C"; break;
		default : res = "F"; break;
		}
		System.out.println("결과: " + res);
		System.out.println();
	}
}
