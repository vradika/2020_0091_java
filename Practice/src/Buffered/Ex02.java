package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			Ex01[] arr = new Ex01[5];
			for (int i = 0; i < arr.length; i++) {
				Ex01 ex1 = new Ex01();
				// 정보입력
				System.out.print("이름 입력 >> "); ex1.setName(br.readLine());
				System.out.print("국어 점수 >> "); ex1.setKor(Integer.parseInt(br.readLine()));
				System.out.print("영어 점수 >> "); ex1.setEng(Integer.parseInt(br.readLine()));
				System.out.print("수학 점수 >> "); ex1.setMath(Integer.parseInt(br.readLine()));
				System.out.print("체육 점수 >> "); ex1.setSports(Integer.parseInt(br.readLine()));
				
				ex1.s_sum(ex1.getKor(),ex1.getEng(), ex1.getMath(), ex1.getSports());
				
				arr[i] = ex1;
			}
			// 순위
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].getSum() < arr[j].getSum()) {
						arr[i].setRank(arr[i].getRank() + 1);
					}
				}
			}
			/*
			Ex01. tmp;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].getRank() > arr[j].getRank()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = arr[i];
						
					}
				}
			}
			*/
			System.out.println("이름\t총점\t평균\t학점\t순위");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName() + "\t");
				System.out.print(arr[i].getSum() + "\t");
				System.out.print(arr[i].getAvg() + "\t");
				System.out.print(arr[i].getHak() + "\t");
				System.out.println(arr[i].getRank());
			}
	}
}
