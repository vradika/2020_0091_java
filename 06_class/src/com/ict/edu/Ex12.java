package com.ict.edu;

public class Ex12 {
	private String name;
	private String hak;
	private int sum;
	private int rank;
	private double avg;

	public Ex12() {}
	public Ex12(String name, int sum, double avg, String hak, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}
	// 학점 구하기
	public String s_hak() {
		if (avg > 90) {
			hak = "A학점";
		} else if (avg > 80) {
			hak = "B학점";
		} else if (avg > 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		return hak;
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
