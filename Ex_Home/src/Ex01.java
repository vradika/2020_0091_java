import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mid, fin, rep, att;
		double score;
		char gra;
		String app = null;
		
		System.out.println("중간고사 점수를 입력하시오: "); mid = Integer.parseInt(br.readLine());
		System.out.println("기말고사 점수를 입력하시오: "); fin = Integer.parseInt(br.readLine());
		System.out.println("보고서 점수를 입력하시오: "); rep = Integer.parseInt(br.readLine());
		System.out.println("출석 점수를 입력하시오: "); att = Integer.parseInt(br.readLine());
		
		score = (double)(mid + fin) / 2 * 0.6 + rep * 0.2 + att * 0.2;
		
		if (score >= 95) {
			gra = 'A';
		} else if (score >= 85) {
			gra = 'B';
		} else if (score >= 75) {
			gra = 'C';
		} else if (score >= 60) {
			gra = 'D';
		} else {
			gra = 'F';
		}
		
		switch (gra) {
		case 'A':
		case 'B': app = "Excellent"; break;
		case 'C':
		case 'D': app = "Good"; break;
		case 'F': app = "poor";
		}
		
		System.out.printf("성적: %.2f\n", score);
		System.out.println("학점: " + gra);
		System.out.println("평가: " + app);
		
		
	}
}
