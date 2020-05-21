package com.ict.edu01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스: Hash Set, Tree Set;
		// 특징: 중복안됨, 정렬안됨 (TreeSet은 항상 오름차순상태)
		
		// 컬렉션 생성: HashSet<제네닉=객체타입=클래스> 참조변수 = new HashSet<제네닉>();
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> t1 = new TreeSet<Character>();
		TreeSet<String> t2 = new TreeSet<String>();
		
		// 해당 컬렉션에 객체 넣기(일반 객체로 만든 후 넣어야 한다.)
		// 1. 객체로 만들기
		Integer k1 = new Integer(10); 	// 박싱
		Integer k2 = new Integer("20");
		
		// 2. 컬렉션에 넣기(add)
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50);						// 오토박싱: 자료형 int 50을 자동으로 객체 만들어서 넣어준다.
		h1.add(60);						// 오토박싱: 자료형 int 60을 자동으로 객체 만들어서 넣어준다.
		
		// Double 넣기
		Double d1 = new Double(10);
		Double d2 = new Double("20");
		h2.add(d1);
		h2.add(d2);
		// h2.add(10); // 오토박싱은 무조선 자료형이 맞아야 들어간다.
		h2.add(new Double(3.14));
		h2.add(3.14);
		
		h3.add(true);
		h3.add(false);
		h3.add(true); // 오류는 나지 않지만 들어가지 않는다. (중복 허용 않음)
		
		t1.add('J');
		t1.add('A');
		t1.add('V');
		t1.add('A'); // 오류는 나지 않지만 들어가지 않는다. (중복 허용 않음)
		
		t2.add("JAVA");
		t2.add("HTML");
		t2.add("JSP");
		t2.add("CSS");
		t2.add("DB");
		
		System.out.println("==============================");
		System.out.println("전체 내용 보기");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("==============================");
		System.out.println("하나씩 보기<개선된 For, Iterator>");
		for (Integer k : h1) {
			System.out.print(k + " ");
		}
		System.out.println();
		// 언박싱: 객체를 일반적으로 사용하는 자료형으로 변환
		for (int k : h1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		System.out.println("하나씩 보기<Iterator>");
		Iterator<Double> it = h2.iterator();
		// hasNext() => 다음 객체가 존재하면 true
		while (it.hasNext()) {
			// 다음 객체를 꺼내기 위해서 이동하고 반환한다.
			double res = (double) it.next(); 
			System.out.print(res + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		Iterator<Character> it2 = t1.iterator();
		while (it2.hasNext()) {
			char c1 = (char) it2.next();
			System.out.print(c1 + " ");
		}
		System.out.println();
		for (char k : t1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		Iterator<String> it3 = t2.iterator();
		while (it3.hasNext()) {
			String str = (String) it3.next();
			System.out.print(str + " ");
		}
		System.out.println();
		for (String k : t2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
	}
}
