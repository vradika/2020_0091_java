class Ex012{
	public static void main(String[] args){
	// 3939초는 몇 시간, 몇 분, 몇 초인가?
	int time = 3989;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0; // 나머지

	//시간 구하기 = 몫(3600을 나눈 몫이 시간)
	h = time / 3600; // int(몫) = int / int

		// 나머지 구하기
		res = time % 3600;

	// 분 구하기 = 몫
	m = res / 60;
		
		//초 구하기 = 나머지
		s = res % 60;

		//출력하기
		System.out.println(time + "초는" + h + "시간" + m + "분" + s + "초");
		System.out.println("==================");
		
	
	}
}
