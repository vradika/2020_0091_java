package com.ict.edu;

public class Ex06 {
	
	public static void main(String[] args) {
		// 다중 for문 : for문 안에 다른 for문이 존재하는 것
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i= " + i + ", j= " + j);
			}
		}
		// 구구단
		System.out.println("==================================");
		for (int i = 2; i < 10; i++) {
				System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		System.out.println("==================================");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
		for (int j = 1; j < 10; j++) {
			System.out.print(i + " * " + j + " = " + (i*j) + "  ");
		}
		System.out.println();
	}
		System.out.println("==================================");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
			System.out.print(j + " * " + i + " = " + (i*j) + "  ");
		}
		System.out.println();
	}
		System.out.println("==================================");
		// 0000
		// 0000
		// 0000
		// 0000
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		// 1000
		// 0100
		// 0010
		// 0001
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				System.out.println();
			}
			
		}
		
  }
}
