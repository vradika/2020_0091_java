package com.ict.edu;

public class Ex002 {
	
	final static int N =10;
		
	public static void main(String[] args) {
		
		for (int i = N; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println();
		}
	}
}
