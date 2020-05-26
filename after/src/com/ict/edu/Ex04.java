package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 등수는 1로 초기값 부여한다.
		// 2. 나(i) 보다 남(j) 크면 내 순위를 증가 시킨다.
		// 3. 모든 사람이 모든 사람과 비교해야 한다.
		int[] sum = {90, 85, 70, 95, 80, 80, 90};
		int[] rank = {1, 1, 1, 1, 1, 1, 1};
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println();
		for (int k : rank) {
			System.out.print(k + "\t");
		}
		
	}
}
