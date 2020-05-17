package Exfor;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	//	for (int i = 5; i > 0; i--) {
	//		for (int j = 0; j < i; j++) {
		//		System.out.print("*");
			//}
			//System.out.println();
		//}
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
