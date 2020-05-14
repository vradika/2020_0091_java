class Ex003{
	public static void main(String[] args){

		String coff = "아메리카노";
		String ratt = "고구마라떼";
		String dise = "티라미슈 케이크";
		int ame = 1500;
		int rat = 3500;
		int dis = 5000;
		int su1 = 3;
		int su2 = 5;
		int su3 = 3;
		int input = 50000;
		int total = (ame * su1) + (rat * su2 + (dis * su3));
		int vat = (int)(total * 0.1);
		int output = input - (total + vat);

		System.out.println("주문: " + coff + " " + su1);
		System.out.println("주문: " + ratt + " " + su2);
		System.out.println("주문: " + dise + " " + su3);
		System.out.println("주문 확인: " + coff + " " + su1 + "," + ratt + " " + su2 + "," + dise + " " + su3); 
		System.out.println("아메리카노 총 금액: " + (ame * su1));
		System.out.println("고구마라떼 총 금액: " + (rat * su2));
		System.out.println("티라미슈 케이크 총 금액: " + (dis * su3));
		System.out.println("주문 총 금액: " + total);
		System.out.println("낸 금액: " + input);
		System.out.println("부가세: " + vat);
		System.out.println("부가세포함 금액: " + (total+vat));
		System.out.println("남은 금액: " + output);
		System.out.println("==================");
	}
}
