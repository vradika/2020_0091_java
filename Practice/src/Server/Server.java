package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Server implements Runnable{
	
	Socket s;
	Server server;
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw;

	public Server() {
		// TODO Auto-generated constructor stub
	}
	
	public Server(Socket s, Server server) {
		this.s = s;
		this.server  = server;
		
		try {
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
		} catch (Exception e) {
			// TODO: handle exception
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
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
