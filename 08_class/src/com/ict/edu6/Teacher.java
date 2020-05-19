package com.ict.edu6;

public class Teacher extends Person {
	private String Subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.Subject = subject;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + getName() + ",\t" + "나이: " + getAge() + ",\t" +"과목: " + Subject);
	}
}
