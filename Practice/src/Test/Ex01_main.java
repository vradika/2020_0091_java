package Test;

import java.util.Scanner;

public class Ex01_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex01[] arr = new Ex01[5];

		for (int i = 0; i < arr.length; i++) {
			Ex01 student = new Ex01();

			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("국어 >> ");
			int kor = sc.nextInt();
			System.out.print("영어 >> ");
			int eng = sc.nextInt();
			System.out.print("수학 >> ");
			int math = sc.nextInt();

			student.setName(name);
			student.s_sum(kor, eng, math);

			arr[i] = student;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		Ex01 tmp = new Ex01();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getRank() < arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
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
