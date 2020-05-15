import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, math, sports;
		int sum;
		double avg;
		String hak;
		
			System.out.print("이름은 >> "); name = br.readLine();
			System.out.print("국어 >> "); 	kor = Integer.parseInt(br.readLine());
			System.out.print("영어 >> "); 	eng = Integer.parseInt(br.readLine());
			System.out.print("수학 >> " );  math = Integer.parseInt(br.readLine());
			System.out.print("체육 >> ");	sports = Integer.parseInt(br.readLine());
			
		sum = kor + eng + math + sports;
		System.out.println("총 점수 >> " + sum);
		avg = (int)(sum /3.0*10)/10.0;
		System.out.println("평균 >> " + avg);
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		System.out.println("학점 >> " + hak);
		switch (hak) {
		case "A학점": 
		case "B학점": hak = "Eexellent"; break;
		case "C학점": hak = "Good"; break;
		case "D학점": hak = "Poor";
		}
		System.out.println("평가 >> " + hak);
	}	
}
