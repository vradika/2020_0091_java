package com.ict.edu;

public class Ex09 {
	private String name;
	private String hak;
	private int sum;
	private int rank = 1;
	private double avg;
	
	// 합계 구하기
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		s_avg();
	}
	// 평균 구하기
	public void s_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
		s_hak();
	}
	
	// 학점 구하기
	public void s_hak() {
		if (avg > 90) {
			hak = "A학점";
		} else if (avg > 80) {
			hak = "B학점";
		} else if (avg > 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}
	// getter / setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
