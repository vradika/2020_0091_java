class Ex09{
	public static void main(String[] args){
	// 산술연산자 : +, -, /, *, %(나머지)
	// char, 정수형, 실수형 사용가능

	int s1 = 9;
	int s2 = 4;
	int res = 0;

	res = s1 + s2;
	System.out.println("결과 : " + res);

	res = s1 - s2;
	System.out.println("결과 : " + res);

	res = s1 * s2;
	System.out.println("결과 : " + res);
	
	// 정수형으로 만들어서 몫만 나오는 방법
	res = s1 / s2;
	System.out.println("결과 : " + res);

	// 실수형으로 만들어서 나오는 방법
	double result1 = (double)(s1) / s2;
	System.out.println("결과 : " + result1);

	// 정수 / 정수 = 정수 즉, 실수값이 정확하게 나오지 않음
	double result2 = s1 / s2;
	System.out.println("결과 : " + result2);

	res = s1 % s2;
	System.out.println("결과 : " + res);
		System.out.println("==================");
	}
}
