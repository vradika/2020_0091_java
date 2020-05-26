package com.ict.edu04;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("메인: " + Thread.currentThread().getName());
		
		Ex03 e3 = new Ex03();
		Thread thread = new Thread(e3);
		thread.start();
		
		// join() : 현재 스레드는 join()를 호출한 스레드가 끝날때까지 대기 상태로 빠져 있다가
		//			스레드가 join()를 호출한 스레드가 끝나면 다시 실행한다.
		//			즉, join()를 호출한 스레드가 끝나야 실행할 수 있다.
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("수고: " + Thread.currentThread().getName());
	}
}
