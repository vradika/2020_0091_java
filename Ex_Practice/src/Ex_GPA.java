import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_GPA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mid, fin, report, attend;
		double score;
		char grade;
		String app = null;
		
		System.out.println("중간고사 점수를 입력하시오: "); mid = Integer.parseInt(br.readLine());
		System.out.println("기말고사 점수를 입력하시오: ");	fin = Integer.parseInt(br.readLine());
		System.out.println("레포트 점수를 입력하시오: "); report = Integer.parseInt(br.readLine());
		System.out.println("출석 점수를 입력하시오: "); attend = Integer.parseInt(br.readLine());
		System.out.println();
		
		score = (double)(mid+fin) / 2 * 0.6 + report * 0.2 + attend * 0.2;
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
		case 'B': app = "excellent"; break;	
		case 'C':
		case 'D': app = "good"; break;
		case 'F': app = "poor";
		}
		
		System.out.printf("성적: %.2f\n", score);
		System.out.println("학점: " + grade);
		System.out.println("평가: " + app);
	}
}
