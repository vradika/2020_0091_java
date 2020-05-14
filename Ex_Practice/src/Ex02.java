import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		// 문제 7: BufferedReader를 이용하여 입력받아 두수 중 큰 수를 출력하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		
		System.out.println("Input a: "); a = Integer.parseInt(br.readLine());
		System.out.println("Input b: "); b = Integer.parseInt(br.readLine());
		
		System.out.println("큰 수: " + (a > b ? a:b));
		System.out.println("==============================================");
		
		// 문제 8: 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!" 출력
		int num;
		
		System.out.println("점수입력: " ); num = Integer.parseInt(br.readLine());
		
		if (num < 0 || num > 100) {
			System.out.println("입력오류!!!");
		} else {
			System.out.println("입력된 값: " + num);
		}
		System.out.println("===============================================");
		
		// 문제 9: 입력된 문자가 대문자이면 소문자로 출력하고, 소문자이면 대문자로 변환하여 출력하시오
		//			그 외의 문자이면 "입력 데이터 오류" 라고 표시하시오
		char ch;
		System.out.println("Input Character: "); ch = br.readLine().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("result :" + (char)(ch+32));
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("result: " + (char)(ch-32));
		} else {
			System.out.println("입력 데이터 오류");
		}
		System.out.println("===============================================");
		
		// 문제 10: 4개의 값을 콘솔에서 입력받아 처리하시오
		// 조건) 성별: M이면 "남자", 나머지 "여자
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.println("Input name: "); name = br.readLine();
		System.out.println("Input gender:"); gender = br.readLine().charAt(0);
		System.out.println("Input age: "); age = Integer.parseInt(br.readLine());
		System.out.println("Input tall: "); tall = Double.parseDouble(br.readLine());
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + (gender == 'M' ? "남자" : "여자"));
		System.out.println("나이: " + age + "세");
		System.out.printf("신장: %.1fcm", tall );
		System.out.println();
		System.out.println("================================================");
		
		// 문제 11: 2개의 숫자와 연산자를 입력하여 계산하시오
		// 조건 1) 실수인 경우는 소수이하 2째자리까지 출력하시오
		// 조건 2) 연산자가 +, -, *, / 이외의 문자가 들어오면 "연산자 error" 출력하시오
		
		int a1, b1;
		char op;
		
		System.out.println("A값을 입력하시오: "); a1 = Integer.parseInt(br.readLine());
		System.out.println("B값을 입력하시오: "); b1 = Integer.parseInt(br.readLine());
		System.out.println("연산자를 입력(+, -, *, /) ; "); op = br.readLine().charAt(0);
		
		switch (op) {
			case '+': System.out.printf("%d %c %d = %d\n", a, op, b, a+b); break;
			case '-': System.out.printf("%d %c %d = %d\n", a, op, b, a-b); break; 
			case '*': System.out.printf("%d %c %d = %d\n", a, op, b, a*b); break;
			case '/': System.out.printf("%d %c %d = %.2f\n", a, op, b, (double)a/b); break; 
		default: System.out.println("연산자 error");
		}
		System.out.println("==================================================");
		
	}
}
