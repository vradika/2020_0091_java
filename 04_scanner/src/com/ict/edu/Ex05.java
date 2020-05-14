package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0; // 전체 횟수 count;
		int even = 0; // 짝수 count;
		int odd = 0; // 홀수 count;
		
		esc: while (true) {
			total += 1;
			System.out.print("숫자 입력: ");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				str = "짝수";
				even += 1;
			} else {
				str = "홀수";
				odd += 1;
			}
			System.out.println(k + "는" + " " + str + "입니다.");
			while (true) {
				System.out.print("계속 할까요? 1.Yes/ 2.No >>");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} else if (k2 == 2) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요.");
					continue;
				}
		
			}
		}
		System.out.println("전체 횟수: " + total);
		System.out.println("짝수: " + even);
		System.out.println("홀수: " + odd);	
		System.out.println("수고하셨습니다.");
		
	}
}
