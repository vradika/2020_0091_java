package com.ict.edu02;

public class Ex02 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": aaaaaaaaaa");
			
		}
	}
}
			
