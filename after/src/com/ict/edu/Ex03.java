package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 정렬 하기
		
		int[] su = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		int tmp = 0;
		
		
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// 오름차순은 i > j		// 내림차순은 1 < j
				if (su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		// 출력하기
		for (int k : su) {
			System.out.print(k + "\t");
		}
	}
}
