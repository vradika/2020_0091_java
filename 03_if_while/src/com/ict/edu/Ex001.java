package com.ict.edu;

public class Ex001 {
	public static void main(String[] args) {
		int k1 = 90;
		String res = "";
		
		if (k1 >= 90) {
			res = "A 학점 입니다.";
		}else {
			res = "낙제 입니다.";
		}
		System.out.println(res);
		System.out.println("=============");
		
		int k2 = 7;
		if (k2 % 2 == 0) {
			res = "짝수 입니다.";
		}else {
			res = "홀수 입니다.";
		}
		System.out.println(res);
		System.out.println("=============");
		
		char c1 = 'K';
		
		if (c1 >= 'a' && c1 <= 'z') {
			res = "소문자 입니다.";
		}else {
			res = "대문자 입니다.";
		}
		System.out.println(res);
		System.out.println("=============");
		
		int k3 = 4;
		
		if (k3 == 1 || k3 == 3) {
			res = "남자 입니다.";
		}else if (k3 == 2 || k3 == 4) {
			res = "여자 입니다.";
		}
		System.out.println(res);
		System.out.println("=============");
		
		int time = 10;
		int dan = 8590;
		int pay = 0;
		
		if (time > 8) {
			pay = (8 * dan) + (int)((time - 8) * dan * 1.5);
		}else {
			pay = 8 * dan;
		}
		System.out.println(pay);
		System.out.println("=============");
		
		int num1 = 100;
		int num2 = 101;
		int result = 0;
		
		if (num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		System.out.println(result);
		System.out.println();
	}
}
