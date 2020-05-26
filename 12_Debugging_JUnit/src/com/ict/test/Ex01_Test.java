package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;

// JUnit : 단위 테스트(메소드 단위로 테스트) 도구, 이클립스에서 기본적으로 제공
// 블랙박스 테스트 : 입력값을 넣으면 예상값이 일치하면 성공,
//					 예상값이 일치하지 안으면 실패.
// assertEquals : 기본형 변수 또는 객체의 값이 예상값과 일치하는지 검사하는 메소드
// assertSame : 두 객체가 같은 객체 인지 검사 (주소가 일치하는지 검사하는 메소드)
// assertNull : null인지 검사
// assertNotNull : null이 아닌지 검사
// assertTrue(e) : a가 참인지 검사
// assertArrayEquals : 배열 a 와 배열 b가 일치하는지 확인

public class Ex01_Test {
	Ex01 t1;
	// 테스트 전 : 실행할 메소드의 클래스를 객체 생성
	// 애노테이션: 주석의 일종으로 컴파일러에게 지시를 내리는 것
	@Before
	public void tBefore() {
		System.out.println("실행 클래스를 객체 생성하자");
		t1 = new Ex01();
	}
	// 테스트를 실행하는 메소드
	@Test
	public void addTest() {
		// 메소드를 실행한 결과값 
		int res = t1.add(10, 20);
		// expected => 예상값, actual => 결과값
		assertEquals(30, res);
	}
	@Test
	public void subTest() {
		// 메소드를 실행한 결과값 
		int res = t1.sub(1, 5);
		// expected => 예상값, actual => 결과값
		assertEquals(-4, res);
	}
	// 테스트 실행 후
	@After
	public void tAfter() {
		System.out.println("데트스 실행 후 메소드 실행");
	}

}
