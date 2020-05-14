import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		// 문제 1: a 와 b의 값을 형변환 해서 두수의 곱을 구하시오
		String a1 = "100";
		String b1 = "200";
		int num_a = Integer.parseInt(a1);
		int num_b = Integer.parseInt(b1);
		System.out.println(num_a + " * " + num_b + " = " + (num_a * num_b) );
		System.out.println("=====================");
		
		// 문제 2: 65,430원을 만들기 위한 화폐의 갯수를 구하시오.
		int money = 65430;
		int a, b, c, d;
		System.out.println("money = " + money);
		a = money / 10000;
		money -= a * 10000;
		b = money / 1000;
		money -= b * 1000;
		c = money / 100;
		money -= c * 100;
		d = money / 10;
		money -= d * 10;
		System.out.println("만원 = " + a);
		System.out.println("천원 = " + b);
		System.out.println("백원 = " + c);
		System.out.println("십원 = " + d);
		System.out.println("======================");
		
		// 문제 3: 급여명세서를 작성하시오
		// 조건1) 기본급이 1,500,000원, 수당이 55,000원, 세금은 기본급의 10%
		// 조건2) 실수령액 = 기본급 + 시간수당 - 세금
		int pay = 1500000;
		int timePay = 55000;
		double tax = 0.1;
		int resultPay = (pay + timePay - (int)(pay * tax));
		System.out.println("실수령액: " + resultPay);
		System.out.println("=======================");
		
		// 문제 4: 각각 변수에 대입하여 출력하시오
		// 조건1) data는 이효리, 개발부, 대리, 1500000로 대입
		//			변수명은 각각 name, department, position, sal로 할 것
		// 조건2) 출력은 아래와 같은 메서드(함수)를 이용하시오
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		System.out.println("이름: " + name);
		System.out.printf("부서: %s\n ", department);
		System.out.print("직위: " + position +  "급여: " + sal + "원");
		System.out.println();
		System.out.println("=========================");
		
		// 문제 5: 다음을 입력받아 계산하시오
		// 입력: Input name : 민들래, kor = 90, eng = 70, mat = 75
		// 출력: 이름 : 민들래, 합계점수: 235점, 평균점수: 78.3 <-- 소수 1자리까지 출력하시오
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name1 = "";
		int kor, eng, mat;
		
		System.out.print("Input name: "); name1 = br.readLine();
		System.out.print("Kor: "); kor = Integer.parseInt(br.readLine());
		System.out.print("eng: "); eng = Integer.parseInt(br.readLine());
		System.out.print("mat: "); mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		
		System.out.println("이름: " + name1);
		System.out.println("합계 점수: " + sum);
		System.out.printf("평균 점수: %.1f ", avg);
		System.out.println();
		System.out.println("==========================");
		
		// 문제 6: 다음을 입력받아 계산하시오
		// (삼각형 넓이 = (밑변 * 높이)/2)
		int bottom, height;
		
		System.out.println("**** 삼각형의 넓이 구하기 ****");
		System.out.print("밑변: "); bottom = Integer.parseInt(br.readLine());
		System.out.print("높이: "); height = Integer.parseInt(br.readLine());
		
		double area = (double)(bottom * height) / 2;
		System.out.printf("넓이: %.2f", area);
		
	}
}
