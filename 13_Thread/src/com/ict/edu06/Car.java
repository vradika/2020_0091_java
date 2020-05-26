package com.ict.edu06;

import java.util.ArrayList;
import java.util.List;

// 자동차 생산 공장
public class Car {
	private List<String> carList = null;
	
	public Car() {
		// 자동차 창고
		carList = new ArrayList<String>();
	}
	
	// 랜덤으로 자동차 생산하기
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) {
			case 0: carName = "카마로SS"; break;
			case 1: carName = "제네시스 쿠페"; break;
			case 2: carName = "혼다 X-Max 300 ABS"; break;
		}
		return carName;
	}
	
		// 소비자가 자동차를 사는 메소드 
		public synchronized String pop() {
		String carName = null;
		// 자동차 창고 재고가 없을 때 판매하지 못함
		if (carList.size() == 0) {
			try {
				System.out.println("준비된 차가 없습니다." + "생산할 때까지 기다리세요.");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 재고가 있을 때는 가장 나중에 들어간 차를 삭제(판매)
		carName = (String)carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 구입했습니다." + "손님이 구입한 차량은" + " " + carName + " ");
			return carName;
	}
	
	// 자동차 창고에 차 넣기
	public synchronized void push(String car ) {
		// 받은 car를 자동차 창고(carList)에 넣기
		carList.add(car);
		System.out.println("차가 만들어 졌습니다." + "차 이름은" + " " + car + " ");
		// 재고가 없을 때 wait()된 스레드 다시 실행 시키기
		if (carList.size() == 5) {
			this.notify();
		}
	}
}
