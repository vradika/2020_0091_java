package com.ict.edu01;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex04[] arr = new Ex04[3];
		for (int i = 0; i < arr.length; i++) {
			Ex04 Person = new Ex04();
			System.out.print("이름 >> ");
			Person.setName(sc.next());
			
			System.out.print("국어 >> ");
			int kor; kor = sc.nextInt();
			
			System.out.print("영어 >> ");
			int eng; eng = sc.nextInt();
			
			System.out.print("수학 >> ");
			int math; math = sc.nextInt();
			
			Person.s_sum(kor, eng, math);
			
			arr[i] = Person;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		Ex04 tmp = new Ex04();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("이름\t총점\t평균\t학점\t순위");
		HashSet<Ex04> set = new HashSet<Ex04>();
		set.add(arr[0]);
		set.add(arr[1]);
		set.add(arr[2]);
		for (Ex04 k : set) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}	
	}
}
