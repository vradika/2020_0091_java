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
		
			System.out.print("이름은 >> "); name = br.readLine();
			System.out.print("국어 >> "); 	kor = Integer.parseInt(br.readLine());
			System.out.print("영어 >> "); 	eng = Integer.parseInt(br.readLine());
			System.out.print("수학 >> " );  math = Integer.parseInt(br.readLine());
			System.out.print("체육 >> ");	sports = Integer.parseInt(br.readLine());
			
		sum = kor + eng + math + sports;
		System.out.print("총 점수 >> " + sum);
		avg = (int)(sum /3.0*10)/10.0;
		System.out.println("평균 >> " + avg);
	}

}
