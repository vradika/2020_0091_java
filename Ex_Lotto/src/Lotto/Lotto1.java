package Lotto;

public class Lotto1 {

	public static void main(String[] args) {
		int[] Lotto = new int[7];
		
		System.out.println("====***$$$ 로또 번호 자동 생성기 $$$***====");
		
		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()* 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (Lotto[j] == Lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i] + "\t");
		}
		System.out.println();
		System.out.println("실망하지마세요! 보너스 번호가 있으니까요!");
		System.out.println("마지막 보너스 번호 >> " + Lotto[6]);
	}

}
