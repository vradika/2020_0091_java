package com.ict.edu;

public class Ex15 {
	// static 초기화
	//	static{
	//			내용;
	//	}
	int s1 = 100;
	static int s2 = 200;
	static int k2 = 2;
	// static 초기화
	static {
		s2 = 10000;
		s3 = 20000;
		s4 = 30000;
	}
	static int s3 = 10;
	static int s4;  
	static int k3 = 2;
	static int k4; 
	public static void main(String[] args) {
		// System.out.println(s1);
		System.out.print(s2 + "\t");
		System.out.print(s3 + "\t");
		System.out.println(s4 + "\t");
		System.out.println("===============");
		System.out.print(k2 + "\t");
		System.out.print(k3 + "\t");
		System.out.println(k4 + "\t");
	}
}
