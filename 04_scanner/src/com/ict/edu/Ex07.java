package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		esc:while (true) {
			// 정보 입력
			System.out.print("입금액: ");
			int input = sc.nextInt();
			System.out.print("메뉴를 선택하세요. 단, 부가세 별도");
			System.out.println("\n메뉴 번호: \n1.커피음료(3500), \n2.이온음료(2500), \n3.물(1500), \n4.과일쥬스(4000) >> ");
			int menu = sc.nextInt();		
			
			// 정보 가공
			String drink = "";
			int dan = 0;
			int su = 1;
			switch (menu) {
			case 1: drink = "커피음료"; dan = 3500; break;
			case 2: drink = "이온음료"; dan = 2500; break;
			case 3: drink = "물"; 		dan = 1500; break;
			case 4: drink = "과일쥬스"; dan = 4000; break;
			}
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int output = input - (total + vat);
			
			// 정보 출력
			System.out.println("선택한 음료: " + drink);
			System.out.println("입금액: " + input);
			System.out.println("잔돈: " + output);
			
			while (true) {
				System.out.println("계속 주문 하시겠습니까? 1.Yes / 2.No");
				int menu1 = sc.nextInt();
				if (menu1 == 1) {
					continue esc;
				} else if (menu1 == 2) {
					break esc;
				} else {
					System.out.println("잘못 눌렀습니다.");
					continue;
				}
			}
		}	
		System.out.println("주문 감사합니다.");
	}
}
