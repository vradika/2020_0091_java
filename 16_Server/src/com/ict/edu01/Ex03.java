package com.ict.edu01;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable {
	
	ServerSocket ss = null;
	
	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중...");
			
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				Socket s = ss.accept();
				System.out.println("IP: " + s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());
		
	}
}
