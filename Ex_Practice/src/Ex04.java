import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		esc: while (true) {
			int kor, eng, mat, con;
			double score;
			char grade;
			String app = null;
			String name = "";
			
			System.out.print("이름 입력: "); name = br.readLine();
			System.out.print("국어점수 입력: "); kor = Integer.parseInt(br.readLine());
			System.out.print("영어점수 입력: "); eng = Integer.parseInt(br.readLine());
			System.out.print("수학점수 입력: "); mat = Integer.parseInt(br.readLine());
			
			score = ((kor + eng + mat) / 3.0 * 10) / 10.0;
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			switch (grade) {
			case 'A':
			case 'B': app = "Excellent!!!"; break;
			case 'C':
			case 'D': app = "Good!!"; break;
			case 'F': app = "Poor!";
			}
			System.out.printf("성적: %.1f\n", score);
			System.out.println("학점: " + grade);
			System.out.println("평가: " + app);
			System.out.println();
			
			while (true) {
				System.out.print("계속 진행 하시겠습니까? 1.Yes / 2.No >> "); con = Integer.parseInt(br.readLine());
				if (con == 1) {
					continue esc;
				} else if (con == 2) {
					break esc;
				} else {
					System.out.println("잘못 입력!!");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println("성적 처리 프로그램을 종료합니다.");
	}
}
