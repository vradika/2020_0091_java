class Ex06{
	public static void main(String[] args) {
	// 숫자드르이 크기에 따른 저장 원리
	// byte < short < char < int < long < float < double

	// 1. 자기보다 큰 자료형으로는 자유롭게 저장할 수 있다. (자동형변환, 프로모션)

	int s1 = 'A';
	System.out.println(s1);

	long s2 = 241;
	System.out.println(s2);
	
	float s3 = s2;
	System.out.println(s3);

	double s4= s3;
	System.out.println(s4);

	// 2. 자기보다 작은 자료형으로 저장할  때는 오류발생
 	// 오류 방생을 방지하기 위해서 강제로 자료형을 변경한다. (강제 형변환, 디모션, casting)
	// 강제로 형변환를 하면 데이터가 변경 될 수 도 있다.
	// 강제로 형변환 하는 방법 : 등호(=)를 기준으로 무조건 외쪽 자료형으로 마춰야 한다.
	// 자료형 이름 = (왼쪽 자료형)(데이터)

	byte b1 = (byte)(129);
	System.out.println(b1);

	int b2 = 110;
	byte b3 = (byte)(b2);
	System.out.println(b3); 

	float b4 = (float)(34.125);
	System.out.println(b4);

	// 정수
	int b5 = (int)(87.12);
	System.out.println(b5);

	// 소숫점 첫째자리까지 구하자
	// double b6 = 87.12;

	// 3. char 형변환
	char c1 = 'a' + 2;
	System.out.println(c1);

	char c2 = 97 + 2;
	System.out.println(c2);

	int b6 = c2;
	System.out.println(b6);
System.out.println("==================");
	}
}
