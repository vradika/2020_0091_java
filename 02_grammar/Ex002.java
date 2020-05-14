class Ex002{
	public static void main(String[] args){
		
	// 여자 사람 10명이 가케에 와서 각각 다른 음료를 주문한다.
	// 10명이 주문한 음료의 총 금액을 구하고, 부가세를 구하라.
	// 계산 후에 남은 금액을 구하라


	String me1 = "블루베리요거트스무디";
	String me2 = "딸기요거트스무디";
	String me3 = "돌체라떼";
	String me4 = "리스트레또 딜라이트";
	String me5 = "에스프레소";

	int dan1 = 4500;
	int dan2 = 4000;
	int dan3 = 2500;
	int dan4 = 5000;
	int dan5 = 1000;

	int su1 = 2;
	int su2 = 1;
	int su3 = 2;
	int su4 = 3;
	int su5 = 2;

	int total = (dan1 * su1) + (dan2 * su2) + (dan3 * su3) + (dan4 * su4) + (dan5 * su5);
	int vat = (int)(total * 0.1);
	int input = 40000;
	int output = input - (total + vat);

	System.out.println("주문 확인: " + me1 + su1 + ", " + me2 + su2 + ", " + me3 + su3 + ", " + me4 + su4 + ", " + me5 + su5);
	System.out.println("주문 총 금액: " + total);
	System.out.println("부가세: " + vat);
	System.out.println("부가세합산 금액: " + (total + vat));
	System.out.println("결제 금액: " + input);
	System.out.println("남은 금액: " + output);  
	}
}
