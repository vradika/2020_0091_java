package com.ict.edu01;

import java.util.ArrayList;
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
	}
}
