package com.ict.edu04;

public class Ex03 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Run: " + Thread.currentThread().getName());
			
		}
		first();
		System.out.println("Run: " + Thread.currentThread().getName());
	}
	
	public void first() {
		for (int i = 0; i < 50; i++) {
			System.out.println("first: " + Thread.currentThread().getName());
		}
	}
}
