package com.ict.edu01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection : 원격지 서버의 자원의 결과와 원격 서버의 헤더정보들을 가져올 수 있다.
public class Ex03 {
	public static void main(String[] args) {
		
		// InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			
			// new InputStreamReader(conn.getInputStream());
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			System.out.println("인코딩 : " + conn.getContentEncoding() );
			System.out.println("길  이 : " + conn.getContentLength());
			System.out.println("문서타입 : " + conn.getContentType());
			
			// 인터넷 정보는 헤더와 바디로 나눠진다.
			// 헤더 정보를 가지고 웹 브라우저가 해석하고 실행한다.
			// 헤더 정보 얻어내는 방법
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println(k + " " + list.get(k));
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				// isr.close();
			} catch (Exception e2) {
			}
		}
	}
}
