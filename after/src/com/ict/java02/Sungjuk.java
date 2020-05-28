package com.ict.java02;

import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] arr = new Person[5];
		
		for (int i = 0; i < arr.length; i++) {
			Person person = new Person();
			
			System.out.print("이름 >> ");
			String name = sc.next();
			person.setName(name);
			
			System.out.print("국어 >> ");
			int kor = sc.nextInt();
			
			System.out.print("영어 >> ");
			int eng = sc.nextInt();
			
			System.out.print("수학 >> ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			person.setSum(sum);
			
			double avg = (int)(sum / 3.0 * 10) / 10.0;
			person.setAvg(avg);
			
			String hak = "";
			if (avg >= 90) {
				hak = "A학점";
			} else if (avg >= 80) {
				hak = "B학점";
			} else if (avg >= 0) {
				hak = "C학점";
			} else {
				hak = "F학점";
			}
			person.setHak(hak);
			
			arr[i] = person;
		} // for문 끝
		
		// 순위 : 나(i)와 남(j)이 비교해서 나보다 큰 놈이 있으면 내 등수 증가한다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// 정렬 : 나(i)와 남(j)이 비교해서 나보다 작은 놈이 있으면 자리 변경
		// 		  자리변경을 위해 임시 저장이 필요하다.
		Person tmp = new Person(); 
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
			}
		}
		
		// 출력
		for (Person k : arr) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}	
	}
}
}
