import java.util.Scanner;

public class Sungjuk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] per = new Person[5];
		Person p1 = new Person();
		for (int i = 0; i < per.length; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			
			p1.s_sum(kor, eng, math);
			per[i] = p1;
		}
		for (int i = 0; i < per.length; i++) {
			for (int j = 0; j < per.length; j++) {
				if (per[i].getSum() < per[j].getSum()) {
					per[i].setRank(per[i].getRank() + 1);
				}
			}
		}
		int tmp =0;
		for (int i = 0; i < per.length; i++) {
			for (int j = 0; j < per.length; j++) {
				if (per[i].getRank() > per[j].getRank()) {
					tmp = per[j];
					per[j] = per[i];
					per[i] = tmp;
				}
			}
		}
		System.out.print(p1.getName());
		System.out.print(p1.getSum());
		System.out.print(p1.getAvg());
		System.out.print(p1.getHak());
		System.out.println(p1.getRank());
	}
}
