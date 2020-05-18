package com.ict.edu3;

public class Employee extends Person {
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("이름: " + getName() + ", " + "나이: " + getAge() + ", " + "부서: " + dept);
	}
}
