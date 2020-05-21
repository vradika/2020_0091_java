package Practice1;

import java.util.Scanner;

public class PracticeEx {
	public static void main(String[] args) {
		
		// 문제 1. a 와 의 값을 형변환 해서 두 수의 곱을 구하시오.
		String a = "100";
		String b = "200";
		
		int num_a = Integer.parseInt(a);
		int num_b = Integer.parseInt(b);
		
		System.out.println("두 수의 곱은 >> " + (num_a * num_b));
		System.out.println("================================");
		
		// 문제 2. 65430월을 만들기 위한 화폐의 갯수를 구하시오.
		int money = 65430;
		int a1, b1, c1, d1;
		
		System.out.println("money >> " + money);
		
		a1 = money / 10000;
		money -= a1 * 10000;
		b1 = money / 1000;
		money -= b1 * 1000;
		c1 = money / 100;
		money -= c1 * 100;
		d1 = money / 10;
		money -= d1 * 10;
		
		System.out.println("만원 >> " + a1);
		System.out.println("천원 >> " + b1);
		System.out.println("백원 >> " + c1);
		System.out.println("십원 >> " + d1);
		System.out.println("================================");
		
		// 문제 3. 급여 명세서를 작성하시오
		//	조건 1) 기본급여 1,500,000원, 수당이 55,000원, 세금은 기본급의 10%
		//	조건 2) 싱수령액 = 기본급 + 시간수당 - 세금
		int pay = 1500000;
		int timePay = 55000;
		double tax = 0.1;
		int resultPay = 1500000 + 55000 - (int)(pay * tax);
		
		System.out.println("실수령액 >> " + resultPay);
		System.out.println("================================");
		
		// 문제 4. 각각 변수에 대입하여 출력하시오
		//	조건 1) data는 이효리, 개발부, 대리, 1500000로 대입, 변수명은 각각 name, department, position, sal로 할 것
		//	조건 2) 출력은 아래와 같은 메서드(함수)를 이용하시오
		/* --출력--
		이름 : 이효리     ---> println
		부서 : 개발부     ---> printf  
		직위 : 대리       ---> print 1번만써서 직위,급여출력
		급여 : 1500000원 */
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		System.out.println("이름 >> " + name);
		System.out.printf("부서 >> %s\n", department);
		System.out.print("직위 >> " + position + "\n급여 >> " + sal);
		System.out.println();
		System.out.println("================================");
		
		// 문제 5. 다음을 입력받아 계산하시오
		/* --입력--
		Input name : 민들래
		kor : 90 
		eng : 70 
		mat : 75

		--출력--
		이름 : 민들래
		합계점수 : 235점
		평균점수 :  78.3   <-- 소수 1자리까지출력하시오 */
		Scanner sc = new Scanner(System.in);
		
		String name1 = "";
		int kor, eng, math;
		
		System.out.println("Input name >> ");
		name1 = sc.next();
		System.out.println("kor >> ");
		kor = sc.nextInt();
		System.out.println("eng >> ");
		eng = sc.nextInt();
		System.out.println("math >> ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (sum / 3.0) * 1.0;
		
		System.out.println("이름 >> " + name1);
		System.out.println("총점 >> " + sum);
		System.out.printf("평균 >> %.1f", avg);
		System.out.println();
		System.out.println("================================");
		
		// 문제 6. 다음을 입력 받아 계산하시오
		//	(삼각형넓이 = (밑변 * 높이) / 2)
		/* --입력--
		**** 삼각형의 넓이 구하기  ****
		밑변 :  10  
		높이 :   3
		   

		--출력--
		넓이 :   XX.XX  <--- 소수 2자리까지출력하시오 */
		int bottom, height;
		
		System.out.println("***** 삼각형의 넓이 구하기 *****");
		System.out.print("밑변 >> ");
		bottom = sc.nextInt();
		System.out.print("높이 >> ");
		height = sc.nextInt();
		
		double area = (double)(bottom * height) / 2 ;
		System.out.printf("넓이 >> %.2f", area);
	}  
}
