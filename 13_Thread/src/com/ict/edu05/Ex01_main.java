package com.ict.edu05;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01 t1 = new Ex01();
		
		new Thread(t1, "Dog").start();
		new Thread(t1, "Cat").start();
		new Thread(t1, "Tiger").start();
		new Thread(t1, "Lion").start();
		
	}
}
