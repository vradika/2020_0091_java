package com.ict.edu3;

public class School {
	public static void main(String[] args) {
				
		Person s = new Student("이선도 학생", 24, 2020);
		Person t = new Teacher("박민환 교수", 30, "바이오 공학");
		Person e = new Employee("우수철 관리자", 40, "교무 총괄과");
		
		// 만약에 Person print()가 없으면
		// 아무리 Student(), Teacher(), Employee()에 print()가 있어도 사용 불가
		s.print();
		t.print();
		e.print();
	}
}
