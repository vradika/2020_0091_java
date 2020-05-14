package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		esc:while (true) {
			// 정보 입력 받기
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어점수 입력: ");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력: ");
			int eng = sc.nextInt();
			System.out.print("수학점수 입력: ");
			int mat = sc.nextInt();
			
			// 정보 가공
			int sum = kor + eng + mat;
			double avg = (int)(sum / 3.0 * 10) / 10.0;
			String result = "";
			
			if (avg >= 90) {
				result = "A학점";
			} else if (avg >= 80) {
				result = "B학점";
			} else if (avg >= 70) {
				result = "C학점";
			} else if (avg >= 60) {
				result = "D학점";
			} else {
				result = "F학점";
			}
			
			//정보 출력
			System.out.println();
			System.out.println("이름: " + name);
			System.out.println("총점: " + sum);
			System.out.println("평균: " + avg);
			System.out.println("학점: " + result);
			
			while (true) {
				System.out.println();
				System.out.println("계속 진행 하시겠습니까? 1.Yes/ 2.No >>");
				int con = sc.nextInt();
				if (con == 1) {
					continue esc;
				} else if (con == 2) {
					break esc;
				} else {
					System.out.println("잘못 눌렀습니다.");
					continue;
				}
			}
		}
		System.out.println();
		System.out.println("수고하셨습니다.");
		System.out.println("성적 처리 시스템을 종료합니다.");
		
	}
}
