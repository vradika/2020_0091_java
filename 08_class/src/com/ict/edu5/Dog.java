package com.ict.edu5;

// 중간에 tiger클래스가 있기는 하지만 그냥 추상클래소 body를 와성하지 않았다.
// Tiger를 상속 박은 Dog는 tiger가 완성하지 않은 body를 완성
public class Dog extends Tiger {
	@Override
	public void like() {
			System.out.println("깨물기");
	}
}
class Dog2 extends Tiger2{

	@Override
	public void sleep() {

		
	}

	@Override
	public void like() {

		
	}
	
}