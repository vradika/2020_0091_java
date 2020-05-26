package com.ict.java01;

public class Ex01 {
	public static void main(String[] args) {
		// Ex1. 자바에서 사용하는 기본 자료형
		// 자료형(Data Type)이란? >> 자바에서 사용하는 데이터의 형태를 구분 
		// 자료형 	 : 키워드
		// boolean형 : boolean : true(참), false(거짓)
		// 문자형 	 : char    : 숫자로 저장된다. (a => 97, A=> 65)
		// 정수형    : byte, short, int, long : 일반적으로 정수 int
		// 실수형    : float, double          : 일반적으로 실수 double
		// 주의사항 : String 기본 자료형으로 사용하지만 기본 자료형은 아니다.
		//			: String 처럼 자료형으로 사용하는 것을 참조 자료형이라 한다.
		
		
		
		// Ex2. 정수값 10을 su라는 변수에 넣고 변수 su에 데이터 들어갔는지 확인하는 코딩을 하자
		int su = 10;
		System.out.println(su);
		// boolean b1에 참을 저장하자
		boolean b1 = true;
		System.out.println(b1);
		// 실수값 3.14를 d1에 저장하자
		double d1 = 3.14;
		System.out.println(d1);
		
		
		
		System.out.println();
		// Ex3. a++ 과 ++a의 차이점을 쓰시오
		// a++ : 현재 변수값으로 연산한 후 나중에 변수 값을 1 증가 시킨다.
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		// ++a : 현재 변수값을 먼저 1 증가 시키고 난 후, 나머지 연산을 수행한다.
		int b = 10;
		System.out.println(++b);
		System.out.println(b);
		
		
		
		System.out.println();
		// Ex4. 논리 연산자 AND와 OR에 대해서 쓰시오
		// AND(논리곱, 교집합, &&) : 주어진 조건들이 모두 true일 때 결과가 true이다.
		//					       : 만약에 조건들 중 하나라도 false가 있으면 결과는 false
		//					       : false를 만나면 false 뒤에 연산은 하지 않는다.
		
		// OR(논리합, 합집합, ||)  : 주어진 조건이 모두 false일 때 false
		//  					   : 조건들 중 하나라도 true면 결과는 true
		//						   : true를 만나면 true 뒤에 연산은 하지 않는다.
		boolean b2 = true;
		boolean b3 = true;
		boolean b4 = false;
		boolean b5 = false;
		
		boolean res = b2 && b3;
		System.out.println("res = " + res);
		res = b3 && b4;
		System.out.println("res = " + res);
		res = b4 && b5;
		System.out.println("res = " + res);
		System.out.println();
		boolean res1 = b2 || b3;
		System.out.println("res = " + res1);
		res1 = b3 || b4;
		System.out.println("res = " + res1);
		res1 = b4 || b5;
		System.out.println("res = " + res1);
		
		
		
		
		System.out.println();
		// Ex5. int su = 24 일 때 삼항연산자를 활용해서 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오
		// 삼항연산자 : 자료형 변수 이름 = (조건식=boolean) ? 참일 때 실행 : 거짓일 떄 실행
		// 자료형 변수 이름, 참일 때 실행 결과값, 거짓일 떄 실행 결과값 모두 같은 자료형이어야 한다.
		int num = 24;
		String msg = (num % 2 == 1) ? "홀수" : "짝수";
		String msg1 = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);
		System.out.println(msg1);
	
	}
}
