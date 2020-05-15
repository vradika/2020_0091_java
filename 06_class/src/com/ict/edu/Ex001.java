package com.ict.edu;

public class Ex001 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank;
	
	public Ex001() {
		
	}
	public Ex001(String name, int sum, double avg, String hak, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}
	
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		s_avg();
	}
	
	public void s_avg() {
		avg = (int)(sum/3.0*10)/10.0;
		s_hak();
	}
	
	public void s_hak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		}else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
}
