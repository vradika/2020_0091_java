package Practice1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex01_main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashSet<Ex01> ex1 = new HashSet<Ex01>();
		
		while (true) {
			Ex01 Person = new Ex01();
			
			System.out.print("이름 >> ");
			String name = sc.next();
			
			System.out.print("국어 >> ");
			int kor = sc.nextInt();
			
			System.out.print("영어 >> ");
			int eng = sc.nextInt();
			
			System.out.print("수학 >> ");
			int math = sc.nextInt();
			
			Person.setName(name);
			Person.s_sum(kor, eng, math);
			
			ex1.add(Person);
			
			System.out.println("계속 할까요? Y / N");
			String selec = sc.next();
			if (selec.equalsIgnoreCase("N")) break;
		}
		for (Ex01 k : ex1) {
			for (Ex01 j : ex1) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}
		for (Ex01 k : ex1) {
			System.out.println("이름\t총점\t평균\t학점\t순위");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
			
			
		}
	}
}
