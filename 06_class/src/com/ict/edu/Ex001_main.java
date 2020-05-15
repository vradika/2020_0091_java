package com.ict.edu;

import java.util.Scanner;

public class Ex001_main {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Ex001[] arr = new Ex001[5];
	
	for (int i = 0; i < arr.length; i++) {
		Ex001 per = new Ex001();
		// 입력
		System.out.print("이름 >> ");
		per.setName(sc.next());
		System.out.print("국어 >> ");
		int kor = sc.nextInt();
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		System.out.print("수학 >> ");
		int math = sc.nextInt();
		//
		per.s_sum(kor, eng, math);
		//
		arr[i] = per;
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i].getSum() < arr[j].getSum()) {
				arr[i].setRank(arr[i].getRank() + 1);
			}
		}
	}
	//
	Ex001 tmp = new Ex001();
	for (int i = 0; i < arr.length - 1; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i].getRank() > arr[j].getRank()) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
			}
		}
	}
	//
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i].getName() + "\t");
		System.out.print(arr[i].getSum() + "\t");
		System.out.print(arr[i].getAvg() + "\t");
		System.out.print(arr[i].getHak() + "\t");
		System.out.println(arr[i].getRank());
	}
 }
}
