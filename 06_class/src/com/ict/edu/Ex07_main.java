package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		
		String name = t1.getName();
		int su = t1.getSu();
		int price = t1.getPrice();
		
		System.out.println(name);
		System.out.println(su);
		System.out.println(price);
		System.out.println();
		
		t1.setName("딸기우유");
		name = t1.getName();
		System.out.println(name);
		System.out.println("======");
		
		Ex07 t2 = new Ex07();
		name = t2.getName();
		System.out.println(name);
	}
}
