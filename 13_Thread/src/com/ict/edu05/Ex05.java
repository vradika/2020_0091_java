package com.ict.edu05;

// 5. 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1 - 50까지 출력하고, 두번째 스레드의 출력을 51 - 100까지 출력하고
//	  다시 첫번째 스레드가 101 - 150까지, 그리고 두번째 스레드가 151 - 200까지 출력하라 (synchronized 사용)
public class Ex05 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (;;) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " : " + ++x);
					if (x % 50 == 0) {
					wait();
				} else {
					notify();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Ex05 t = new Ex05();
		new Thread(t, "Tiger").start();
		new Thread(t, "Lion").start();
	}

}
