package com.ict.edu3;

public class Main {
	public static void main(String[] args) {
		// super 와 super(), this 와 this()
		// this: 객체 내부에서 자기 자신을 지칭하는 예약어
		// 		 전역 변수와 지역변수의 이름이 같을 때
		//		 전역 변수 앞에 this를 사용하여 전역변수임을 알 수 있다.
		
		// this([인자]): 객체의 생성자를 지칭하는 예약어
		//		   	     생성자에서 자기의 다른 생성자를 호출할 때 사용
		//		   	     반드시 생성자 첫 줄에 존재 해야 된다.
		
		// super: 부모 클래스의 멤버필드(전역변수)를 지칭하는 예약어
		//		  자식 클래스의 전역 변수와 이름이 같을 때
		//		  부모 클래스 멤버필드 앞에 사용한다.
		
		// super(): 부모의 생성자를 지칭하는 예약어
		//			부모의 생성자를 호출할 때 사용
		//			반드시 생성자 첫 줄에 존재해야 된다.
		// 			this() 와 super() 생성자를 같이 사용할 수 없다.
		//			없으면 생략되어 있다.(this(), super())
		
		T_Sub t1 = new T_Sub();
		
	}
}
