package com.ict.edu03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Player implements Runnable {
	Socket s;
	Server server;
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	String ip;
	
	public Player() {}
	public Player(Socket s, Server server) {
		this.s = s;
		this.server = server;
		
		// 입출력 준비를 끝낸다.
		try {
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {		
		}
		
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if (msg.equalsIgnoreCase("exit")) {
					break;
				} else {
					server.sendMSG(ip + ": " + msg);
				}
			}
		} catch (Exception e) {
		}
	}
	
	
	
}
