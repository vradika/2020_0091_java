package com.ict.edu01;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_mian {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	HashSet<Ex05> Person = new HashSet<Ex05>();
	// Ex09[] arr = Ex09[5];
	// for (int i = 0; i < 5; i++) {
		while (true) {
			Ex05 p = new Ex05();
			
			System.out.println("이름 >> ");
			String name = sc.next();
			
			System.out.println("국어 >> ");	
			int kor = sc.nextInt();
			
			System.out.println("영어 >> ");
			int eng = sc.nextInt();
			
			System.out.println("수학 >> ");
			int math = sc.nextInt();
			
			p.setName(name);
			p.s_sum(kor, eng, math);
			
			Person.add(p);
			
			System.out.println("계속할까요?(Y/N)");
			String str = sc.next();
			if (str.equalsIgnoreCase("N")) break;
			// arr[i] = p;	
		}
		
		// 순위
		for (Ex05 k : Person) {
			for (Ex05 j : Person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}
		// 정렬은 안된다.
		
		// 출력
		for (Ex05 k : Person) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank() + "\t");
		}
  }
} 
