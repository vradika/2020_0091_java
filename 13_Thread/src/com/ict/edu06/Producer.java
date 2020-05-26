package com.ict.edu06;

public class Producer implements Runnable{
	private Car car;
	
	public Producer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			// 자동차 생산
			carName = car.getCar();
			// 자동차 창고에 넣기
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
