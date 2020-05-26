package com.ict.edu03;

public class Ex02 implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + ": AAA");
		}
	}
}
