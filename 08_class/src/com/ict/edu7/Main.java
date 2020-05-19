package com.ict.edu7;

public class Main {
	// 추상클래스: 추상메소드, 반드시 abstract, 일반 메소드, 일반 멤버필드 사용가능
	//				객체 생성 가능, 일반 클래스 사용시 반드시 오버라이딩 필요
	
	// 인터페이스: 상수와 추상메소드만 가지고 있다. / 다중 상속 가능
	//				생성자 => 객체생성 안됨
	//				일반 클래스 사용시 반드시 오버라이딩 필요, 인터페이스와 추상클래스는 오버라이딩 X
	public static void main(String[] args) {
		Protoss p = new Protoss("질럿", 100, false);
		Zerg z = new Zerg("히드라", 100, false);
		Terran t = new Terran("레이스", 100, true);
		
		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);
		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);
		
		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);
		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);
		
		t.decEnergy();
		System.out.println(t.name + ":" + t.energy);
		t.decEnergy();
		System.out.println(t.name + ":" + t.energy);
		
		
	}
}	
