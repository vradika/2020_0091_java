package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// 중첩 while문 : while문 안에 while문
		//					다중 for문과 같다.
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i= "+ i + ", " + "j= " + j);
			}
		}
		System.out.println();
		
		int k1 = 1;
		while (k1 < 4) {
			int g1 = 1;
			while (g1 < 6) {
				System.out.println("k1= "+ k1 + ", " + "g1= " + g1);
				g1++;
			}
			k1++;
		}
		System.out.println();
		// 구구단
		
		int dan1 = 2;
		while (dan1 < 10) {
			System.out.println(dan1 + "단");
			int su1 = 1;
			while (su1 < 10) {
				System.out.println(dan1 + "*" + su1 + "= " + dan1*su1);
				su1++;
			}
			dan1++;
			System.out.println();
		}
	}
}
