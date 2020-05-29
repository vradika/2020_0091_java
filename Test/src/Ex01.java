import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		
		int su = 10;
		System.out.println(su);
		System.out.println("=========================");
		
		int su2 = 24;
		String res = (su2 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(su2);
		System.out.println("=========================");
		
		int dan = 8590;
		int work = 10;
		int money = 0;
		if (work > 8) {
			money = (8 * dan) + (int)((work - 8) * 1.5 * dan);
		} else {
			money = 8 * dan;
		}
		System.out.println("받을 돈은 " + money + "원 입니다.");
		System.out.println("=========================");
		
		Calendar calc = Calendar.getInstance();
		System.out.print(calc.get(Calendar.YEAR) + "년\t");
		System.out.print(calc.get(Calendar.MONTH) + 1 + "월\t");
		System.out.print(calc.get(Calendar.DAY_OF_MONTH) + "일\t");
		System.out.print(calc.get(Calendar.HOUR) + "시\t");
		System.out.print(calc.get(Calendar.MINUTE) + "분\t");
		System.out.print(calc.get(Calendar.SECOND) + "초\t");
		switch (calc.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("주일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		}
	}
}
