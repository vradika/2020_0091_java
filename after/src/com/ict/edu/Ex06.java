package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[4];
		int[] kor = new int[4];
		int[] eng = new int[4];
		int[] math = new int[4];
		
		int[] sum = new int[4];
		double[] avg = new double[4];
		String[] hak = new String[4];
		int[] rank = {1, 1, 1, 1};
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 >> ");
			name[i] = sc.next();
			System.out.print("국어 >> ");
			kor[i] = sc.nextInt();
			System.out.print("영어 >> ");
			eng[i] = sc.nextInt();
			System.out.print("수학 >> ");
			math[i] = sc.nextInt(); 
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A"; 
			} else if (avg[i] >= 80) {
				hak[i] = "B";
			} else if (avg[i] >= 70) {
				hak[i] = "C";			
			} else {
				hak[i] = "F";
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("이름\t 총점\t 평균\t 학점\t 순위\t");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}
}
