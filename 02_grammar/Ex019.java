
public class Ex019 {
	public static void main(String[] args) {
		// 삼항연산자 예제들
		// int k1가 홀수인지 짝수인지 판별하자
		int k1 = 18;
		String res = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("k1은 " + res + " 입니다.");
		
		// int k2가 60이상이면 합격, 아니면 불합격 판별하자
		int k2 = 70;
		res = (k2 >= 60) ? "합격" : "불합격";
		System.out.println("k2sms " + res + " 입니다.");
		
		// char k3 = 대문자인지, 대문자가 아닌지 판별하자
		char k3 = 'c';
		res = ((k3 >= 'A') && (k3 <= 'Z')) ? "대문자" : "노대문자";
		System.out.println("k3는 " + res + " 입니다.");
		
		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 8590;
		int pay = (time > 8) ? (int)((8*dan) + (time-8) * dan*1.5) : time * dan;
		System.out.println("결과: " + pay);
		System.out.println("==================");
	}
}
