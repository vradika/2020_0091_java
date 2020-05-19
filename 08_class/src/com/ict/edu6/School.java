package com.ict.edu6;

public class School {
	public static void main(String[] args) {
				
		Person s = new Student("김민아 학생", 20, 2020);
		Person t = new Teacher("유지환 교수", 28, "생명공학기술");
		Person e = new Employee("신유경 관리자", 30, "교무총괄부서");
		
		// 만약에 Person print()가 없으면
		// 아무리 Student(), Teacher(), Employee()에 print()가 있어도 사용 불가
		s.print();
		t.print();
		e.print();
	}
}
