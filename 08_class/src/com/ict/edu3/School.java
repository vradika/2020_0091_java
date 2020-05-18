package com.ict.edu3;

public class School {
	public static void main(String[] args) {
		
		Person s = new Student("홍길동생", 24, 2020);
		Person t = new Teacher("유신강사", 30, "생명공학");
		Person e = new Employee("살신성인", 35, "교무과");
		s.print();
		t.print();
		e.print();
	}
}
