package com.ict.edu3;

public class Teacher extends Person {
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.Subject = subject;
	}

	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	
	public void print() {
		System.out.println("이름: " + getName() + ", "  + "나이: " + getAge() + ", " + "과목: " + getSubject());
	}
}
