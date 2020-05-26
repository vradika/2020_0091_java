package com.ict.edu01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		// List 인터페이스: 배열과 비슷한 구조, 삽입, 삭제, 추가가 자유롭다, 크기를 미리 정하지 않아도 된다.
		// 관련 클래스: Stack, ArrayList, Vector;
		
		// ArrayList: 멀티스레드 동기화 지원하지 않음
		// Vector 	: 멀티스레드 동기화 지원함
		// ArrayList 와 Vector 사용법은 같다.
		
		ArrayList<String> list = new ArrayList<String>();
		// 추가, 삽입: add
		list.add("박찬호");
		list.add("손흥민");
		list.add("류현진");
		list.add(1, "기성룡");
		
		System.out.println(list);
		System.out.println("================================");
		
		Vector<String> vector = new Vector<String>();
		vector.add("기성룡");
		vector.add("류현진");
		vector.add("손흥민");
		vector.add(2, "박찬호");
		
		System.out.println(vector);
		System.out.println("================================");
		
		// 검색
		if (list.contains("박찬호")) {
			System.out.println(list.indexOf("박찬호") + "번째 위치");
			System.out.println(list.get(2));
			System.out.println(list.lastIndexOf("박찬호") + "번째 위치");
			// 박찬호 대신 박세리로 변경
			list.set(0, "박세리");
			// search, elememtAt, firstElement(), lastElement(): 없음
			// elememtAt, firstElement(), lastElement(): vector에는 존재
		} else {
			System.out.println("존재 없음");
		}
		System.out.println(list);
		System.out.println("================================");
		
		if(vector.contains("기성룡")) {
			System.out.println(vector.indexOf("기성룡") + "기성룡 위치");
			System.out.println(vector.get(2));
			System.out.println(vector.lastIndexOf("기성룡") + "번째 위치");
			System.out.println(vector.elementAt(1));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		
		// 치환
		vector.set(1, "차두리");
		vector.setElementAt("박세리", 2);
		System.out.println(vector);
		
		// 크기
		System.out.println(list.size());
		System.out.println(vector.size());
		
		// 출력
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("================================");
		
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}

	}
}
