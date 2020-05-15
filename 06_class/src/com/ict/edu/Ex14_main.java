package com.ict.edu;

public class Ex14_main {
	String name = "태권브이";
	static String addr = "제주도";
	
	public static void main(String[] args) {
		// 인스턴스 전역변수 사용 못함
		// System.out.println(name);
		
		// static 변수 사용 가능
		System.out.println(addr);
		
		Ex14 t1 = new Ex14();
		System.out.print(t1.su + "\t");
		System.out.print(t1.num + "\t");
		System.out.println(Ex14.num);

		Ex14 t2 = new Ex14();
		System.out.print(t2.su + "\t");
		System.out.print(t2.num +"\t");
		System.out.println(Ex14.num);

		Ex14 t3 = new Ex14();
		System.out.print(t3.su + "\t");
		System.out.print(t3.num +"\t");
		System.out.println(Ex14.num);
		System.out.println("===================");
		
		System.out.print(t1.num + "\t");
		System.out.print(t2.num + "\t");
		System.out.print(t3.num + "\t");
		System.out.println(Ex14.num);
	}
}
