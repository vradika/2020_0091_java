package com.ict.edu07;

import java.io.Serializable;

public class VO implements Serializable {
	private String name;
	private int age;
	private double weigth;
	private boolean gender;
	
	public VO() {
		
	}

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
