package Exfor;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 간단한 2차원 배열 별찍기.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. 삼각형 모양의 별 찍기
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3. 삼각형 모양의 별 찍기
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 4. 피라미드 모양의 별 찍기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 5. 홀수를 입력하면 그에 맞는 다이아몬드(마름모) 모양의 별 찍기
		System.out.print("홀수를 입력해 주세요 >> ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) {
					if (i + j >= num / 2 - 1) {
						System.out.print(" ");
					} else if (j - i >= num / 2 + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i >= num / 2) {
					if (i - j >= num / 2 + 1) {
						System.out.print(" ");
					} else if (i + j >= num / 2 * 3 + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
					
}
