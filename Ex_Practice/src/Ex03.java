import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		String app = null;
		int kor, eng, mat, spo;
		int sum;
		double score;
		char gra;
		
		System.out.println("이름: "); name = br.readLine();
		System.out.println("국어 점수: "); kor = Integer.parseInt(br.readLine());
		System.out.println("영어 점수: "); eng = Integer.parseInt(br.readLine());
		System.out.println("수학 점수: "); mat = Integer.parseInt(br.readLine());
		System.out.println("체육 점수: "); spo = Integer.parseInt(br.readLine());
		
		sum = kor + eng+ mat+ spo;
		System.out.println("4과목 총점: " + sum);
		
		score = sum / 4;
		System.out.println("4과목 평균: " + score);
		
		if (score >= 90) {
			gra = 'A';
		} else if (score >= 80) {
			gra = 'B';
		} else if (score >= 70) {
			gra = 'C';
		} else if (score >= 60) {
			gra = 'D';
		} else {
			gra = 'F';
		}
		
		switch (gra) {
		case 'A':
		case 'B': app = "Excellent!!"; break;
		case 'C': 
		case 'D': app = "Good!!"; break;
		case 'F': app = "Poor!!!!";
			break;
		}
		
		System.out.println("4과목 평균 등급: " + gra);
		System.out.println("4과목 종합 평가: " + app);
		
		
	}
}