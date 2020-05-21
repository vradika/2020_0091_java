


import java.util.Scanner;

public class BaseballGameTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BaseballGame game = new BaseballGame();
		game.setNum();
		
		for (int i = 0; i < 15; i++) {
			
			game.getNum(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

	}

}
