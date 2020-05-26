package com.ict.edu03;

public class TestMain {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
		
		// testA, testB는 Runnable를 가지고 구현 하였으므로 start()가 없다.
		// start() => run()으로 가지 않으면 스레드 처리가 아니다.
		
		// start()는 Thread 클래스가 가지고 있으므로 Thread 클래스를 활용해야 된다.
		
		// 방법 1: Runnable를 상속받은 객체를 Thread 생성자에 넣어준다.
		Thread thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();
		
		// 방법 2: 안드로이드에서 사용하는 방법(익명 내부 클래스)
		new Thread(new Runnable() {	
			@Override
			public void run() {
				while (true) {
					System.out.println(thread.currentThread().getName() + ": 가가가");
				}
			}
		}).start();
	}
}
