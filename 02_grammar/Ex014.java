class Ex014{
	public static void main(String[] args){
	// 비교연산자 : >, <, >=, <=, ==(같다), != (같지않다=다르다)
		// 비교연산자를 사용할 수 있는 자료형 : char, 정수, 실수
		// 연살 결과는 무조건 boolean형(true, false) => 조건식에 사용된다.

	int su1 = 90;
	int su2 = 80;

	char su3 = 'a';
	char su4 = 'A';

	double su5 = 97.0;
	double su6 = 78.0;

	boolean result = su1 > su2;
	System.out.println("결과: " + result);

	result = su3 > su4;
	System.out.println("결과: " + result);

	result = su5 > su6;
	System.out.println("결과: " + result);
	
	result = su1 > su3;
	System.out.println("결과: " + result);
	
	result = su1 > su5;
	System.out.println("결과: " + result);
	
	result = su1 == su5;
	System.out.println("결과: " + result);

	System.out.println("==================");
	}
}
