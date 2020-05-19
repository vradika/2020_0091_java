package com.ict.edu6;

public class Student extends Person{
	private int id;
	
	/*
	public Student() {
		// super(); 오류가 이류
		// super("태권브이", 24) 1. 오류 아님
		// 2. person클래스에 기본 생성자 만들어도 오류 아님
	}
	*/
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + getName() + ", " + "\t" + "나이: " + getAge() + ", " + "\t" + "학번: " + id + "년새내기");
	}
}
