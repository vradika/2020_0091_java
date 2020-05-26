package com.ict.edu01;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		// Map 인터페이스: Key 와 Value를 맵핑하는 구조로 이루어짐
		// 				   Key는 중복될 수 없다.
		//				   Key를 호출하면 Value가 나온다.
		//				   Key를 별도 관리 => keySet()
		//				   add()로 추가 못함
		//    			   put(key, value) 추가한다.
		
		// Map생성 (Key 숫자로 만든다.)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 추가: add x, key(k, v)
		map.put(0, "한국");
		map.put(1, "미국");
		map.put(4, "중국");
		map.put(9, "태국");
		map.put(15, "영국");
		map.put(20, "한국"); // value의 중복은 상관없다.
		map.put(22, "한국");
		map.put(4, "영국"); // key 중복: 덮어쓴다.
		
		System.out.println(map);
		
		// 하나씩 출력 (get(key) => value가 나온다)
		System.out.println(map.get(4));
		System.out.println(map.get("한국"));
		System.out.println("=================================================");
		
		// 일부러 key를 순서대로 만들었기 때문에 for문을 사용할 수 있다.
		// map에서 value를 호출하는 방법: get(key)
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println("=================================================");
		
		// 1씩 증가 하지 않아도, 일정한 규칙이 없이도 사용가능
		for (Integer k : map.keySet()) {
			System.out.println(map.get(k));
		}
		System.out.println("=================================================");
		
		// Map 생성 (Key를 문자열(String)로 만든다 => 일반적인 방법)
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("이름", "고길동");
		map1.put("나이", "34");
		map1.put("주소", "서울시 도봉구 방학동");
		map1.put("성별", "남");
		map1.put("취미", "잠자기");
		
		System.out.println(map1.get("이름"));
		System.out.println(map1.get("나이"));
		System.out.println(map1.get("주소"));
		System.out.println(map1.get("성별"));
		System.out.println(map1.get("취미"));
		System.out.println("=================================================");
		
		for (String k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println("=================================================");
		
		Iterator<String> it = map1.keySet().iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(map1.get(res));
		}
	}
}
