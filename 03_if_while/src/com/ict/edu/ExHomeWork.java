package com.ict.edu;

public class ExHomeWork {
	public static void main(String[] args) {
		
		// 0 ~ 10 까지의 누적 합 구하기.
		int sum = 0;
		int su1 = 0;
		while (su1 < 11) {
			sum = sum + su1;
			
			su1++;
		}
		System.out.println("누적 합: " + sum);
		System.out.println("===============================================");
		
		// 0 ~ 10 까지의 홀수 합 구하기.
		int odd = 0;
		int su2 = 0;
		while (su2 < 11) {
			if (su2 % 2 == 1) {
				odd = odd + su2;
			}
			su2++;
		}
		System.out.println("홀수 합: " + odd);
		System.out.println("===============================================");
		
		// 0 ~ 10 까지의 짝수 합 구하기.
		int even = 0;
		int su3 = 0;
		while (su3 < 11) {
			if (su3 % 2 == 0) {
				even = even + su3;
			}
			su3++;
		}
		System.out.println("짝수 합: " + even);
		System.out.println("===============================================");
		
		// 0 ~ 10 까지의 홀수, 짝수의 합 구하기
		int odd1 = 0;
		int even1 = 0;
		int su4 = 0;
		while (su4 < 11) {
			if (su4 % 2 == 0) {
				even1 = even1 + su4;
			} else {
				odd1 = odd1 + su4;
			}
			su4++;
		}
		System.out.println("짝수의 합: " + even1 + ", " + "홀수의 합: " + odd1);
		System.out.println("===============================================");
		
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		int sum1 = 1;
		int su5 = 7;
		while (su5 > 0) {
			sum1 = sum1 * su5;
			
			su5--;
		}
		System.out.println("7!: " + sum1);
		System.out.println("===============================================");
		
		// 구구단
		int i = 2;
		while (i < 10) {
			System.out.println(i + "단");
			int j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		System.out.println("=============================================");
		
		int i1 = 2;
		while (i1 < 10) {
			System.out.println();
			int j1 = 1;
			while (j1 < 10) {
				System.out.print(i1 + "*" + j1 + "=" + (i1*j1) + "  ");
				j1++;
			}
			i1++;
		}
		System.out.println();
		System.out.println("=============================================");
		
		int i2 = 2;
		while (i2 < 10) {
			System.out.println(i2 + "단");
			int j2 = 1;
			while (j2 < 10) {
				System.out.print(i2 + "*" + j2 + "=" + (i2*j2) + "  ");
				j2++;
				
			}
			System.out.println();
			i2++;
		}
		System.out.println();
		System.out.println("==============================================");
		
	}
}
