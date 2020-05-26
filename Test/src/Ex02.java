import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int su = 0;
		
		su = ran.nextInt(10) + 1;
		
		System.out.println(su);
	}
}
