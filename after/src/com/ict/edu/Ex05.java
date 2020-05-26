package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"홍", "김", "이", "박"};
		int[] kor = {80, 85, 70, 90};
		int[] eng = {80, 85, 70, 90};
		int[] math = {85, 90, 75, 95};
		
		int[] sum = new int[4];
		double[] avg = new double[4];
		String[] hak = new String[4];
		int[] rank = {1, 1, 1, 1};
		
		// 총점, 평균, 학점
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}
		// 순위
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		//출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}
}
