package com.ict.edu06;

import java.io.Serializable;

// 객체의 정보를 담당하는 클래스
// Serializable 인터페이스를 사용해서 직렬화를 할 수 있다.
// 직렬화 제외 시키는 방법 : 변수 앞에 transient 예약어를 사용
// 				 주의 사항 : boolean형은 무조건 false
public class VO implements Serializable {
	private String name;
	private int age;
	transient private double weigth;
	transient private boolean gender;
	
	public VO() { }

	public VO(String name, int age, double weigth, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
}
