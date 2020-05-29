package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sungjuk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person person = new Person();
		ArrayList<Person> list = new ArrayList<Person>();
		esc : while (true) {
			Person p1 = new Person();
			System.out.print("이름 >> ");
			p1.setName(br.readLine());

			System.out.print("국어 >> ");
			p1.setKor(Integer.parseInt(br.readLine()));

			System.out.print("영어 >> ");
			p1.setEng(Integer.parseInt(br.readLine()));

			System.out.print("수학 >> ");
			p1.setMath(Integer.parseInt(br.readLine()));
			
			p1.setSum(p1.getKor() + p1.getEng() + p1.getMath());
			p1.setAvg((int)(p1.getSum() / 3.0 * 10) / 10.0);
			p1.s_hak();

			list.add(p1);

			while (true) {
				String con = "";
				System.out.println("계속 하시겠습니까? Y / N");
				con = br.readLine();
				if (con.equalsIgnoreCase("N")) {
					System.out.println("성적 프로그램 종료");
					System.out.println("수고 하셨습니다.");
					break esc;
				} else if (con.equalsIgnoreCase("Y")) {
					System.out.println("계속 진행 하겠습니다.");
					continue esc;
				} else {
					System.out.println("잘못 눌렀습니다.");
					continue;
				}
				}
			}
			for (Person i : list) {
				for (Person j : list) {
					if (i.getSum() < j.getSum()) {
						i.setRank(i.getRank() + 1);
				}
			}
		}
		Person tmp = new Person();
		for (Person i : list) {
			for (Person j : list) {
				if (i.getRank() > j.getRank()) {
					tmp = i;
					i = j;
					j = tmp;
				}
			}
		}
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (Person k : list) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}

	}
}
