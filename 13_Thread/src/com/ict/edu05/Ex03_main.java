package com.ict.edu05;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		
		Thread thread = new Thread(test, "Dog");
		thread.start();
		
		Thread thread2 = new Thread(test, "Cat");
		thread2.start();
		
	}
}
