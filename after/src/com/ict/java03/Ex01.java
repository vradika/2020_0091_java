package com.ict.java03;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
	// Ex01. Random 클래스를 활용해서 정수 1 ~ 10 사이의 난수를 구하시오.
	// 1. 난수 발생 : Random, Math.Random()
	// 	Random 클래스
		Random ran = new Random();
		
		// boolean형 Random
		System.out.println(ran.nextBoolean());
		// 정수형 Random
		System.out.println(ran.nextInt());
		// 실수형 Random 
		System.out.println(ran.nextDouble()); // 0.0 ~ 1.0
		// 특정범위를 지정한 Random 정수
		System.out.println(ran.nextInt(10) + 1); // (0 ~ 9) + 1
		// 특정범위를 지정한 Random 실수
		System.out.println((int)(ran.nextDouble() * 10) + 1); // (0 ~ 9) + 1
		
	// Math.random() => 0.0이상부터 1.0
		System.out.println(Math.random());
		
		// 특정범위 지정할 수 있다.
		System.out.println((int)(Math.random() * 10) + 1); // (0 ~ 9) + 1
		System.out.println("====================================================");
		
		
		
	// Ex02. Math클래스에서 올림, 반올림, 버림을 실행하는 각각의 메소드를 쓰시오
		// 올림
		System.out.println(Math.ceil(14.45));
		System.out.println(Math.ceil(14.55));
		System.out.println(Math.ceil(14.65));
		// 반올림
		System.out.println(Math.round(14.45));
		System.out.println(Math.round(14.55));
		System.out.println(Math.round(14.65));
		// 버림
		System.out.println(Math.floor(14.45));
		System.out.println(Math.floor(14.55));
		System.out.println(Math.floor(14.65));
		System.out.println("====================================================");
		
		
	
	// Ex03. String 클래스에서 substring()에 대해서 쓰시오
		// subString(시작위치) : 시작위치부터 끝까지
		// subString(시작위치, 끝위치) : 시작위치에서 끝위치 전까지
		String str4 = "010-9907-7433";
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4, 8));
		System.out.println(str4.substring(0, 3)); // 앞 3개만
		System.out.println(str4.substring(9)); // 뒤 4개만
		System.out.println("====================================================");
		
		
		
	// Ex04. String 클래스에서 valueOf()에 대해서 쓰시오
		// valueOf(각종 자료형) : 인자로 들어온 각종 자료형들을 문자열로 만드는 역할.
		boolean b1 = true;
		char c1 = 'K';
		int n1 = 24;
		double n2 = 34.1;
		// System.out.println(b1 + 1); // 원래 boolean은 + 1를 할 수 없다.
		System.out.println(String.valueOf(b1) + 1);
		System.out.println(n1 + 1); // 25
		System.out.println(String.valueOf(n1) + 1); // 241
		System.out.println(n2 + 1); // 35.1
		System.out.println(String.valueOf(n2) + 1); // 34.11
		System.out.println("====================================================");
		// 각종 자료형 처럼 생긴 문자열을 진짜 각종 자료형으로 변경
		String st1 = "true";
		String st2 = "24";
		String st3 = "34.1";
		//System.out.println(Boolean.parseBoolean(st1 + 1); // 원래 boolean은 + 1를 할 수 없다.
		// 문자열 정수 => Integer.parseInt()
		System.out.println(st2 + 1); // 241
		System.out.println(Integer.parseInt(st2));
		// 문자열 실수 => Double.parseDouble()
		System.out.println(st3 + 1); // 34.11
		System.out.println(Double.parseDouble(st3));
		System.out.println("====================================================");
		
		
		
		
	// Ex05. 제네릭과 컬렉션에 대해서 쓰시오
		// 컬렉션 : 객체를 모아서 관리하는 것 
		//			Set, List, Queue, Map
		// 제네릭 : 컬렉션이 어떤 객체들로 이루어져 있는지를 표시하는 객체(혹은 클래스) 타입
		
		
		
	// equals()와 equalsIgnoreCase()
	// String 같다는 표시를 '==' 표시를 사용하면 안된다.
	// 반드시 equals()와 equalsIgnoreCase()로 같다는 표시를 해야 된다.
	// 차이점 : equals() => 대소문자 구별,  equalsIgnoreCase() => 대소문자 구별 안함
		
	// getBytes() : byte[]
		// 해당 문자열을 byte[]로 만든다. (I/O)
	// indexOf(char c), indexOf(String s)
		// 들어온 문자나 문자열의 위치값을 알려준다.
		// 없으면 -1 나온다.
		String str = "BufferedReader";
		// 'r'의 위치찾아라
		int k = str.indexOf('r');
		System.out.println(k);
		// 'er'의 위치 찾아라
		k = str.indexOf("er");
		System.out.println(k);
		// 'f' 의 위치 찾아라
		k = str.indexOf('f');
		System.out.println(k);
		// 두번째 'f'의 위치 찾아라
		k = str.indexOf('f', str.indexOf('f') + 1);
		System.out.println(k);
		// 세번째 'e'의 위치 찾아라
		k = str.indexOf('e', str.indexOf('e', str.indexOf('e') + 1) + 1);
		System.out.println(k);
		System.out.println("====================================================");
	// length() : 문자열의 길이 구함
		String msg = "대한 korea 121";
		System.out.println(msg.length());
		System.out.println("====================================================");
	// replace : 치환
		String str2 = "대한민국";
		String str3 = str2.replace("한", "HAN");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("====================================================");
	// 모든 글자를 대문자로 변경 : toUpperCase
	// 모든 글자를 소문자로 변경 : toLowerCase
		String str5 = "KoreaSeoul";
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		System.out.println(str5.substring(0, 5).toUpperCase() + str5.substring(5).toLowerCase());

	}
}
