package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class Ex01 {
	
	private String name, hak;
	private int kor, eng, math, sports, sum;
	private int rank = 1;
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	private double avg;
	
	public void s_sum(int kor, int eng, int  math, int sports) {
		sum = kor + eng + math + sports;
		s_avg();
	}
	
	public void s_avg() {
		avg = (int)(sum / 4.0 * 10) / 10.0;
		s_hak();
	}
	
	public void s_hak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >=70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		} 
	}
	
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSports() {
		return sports;
	}
	public void setSports(int sports) {
		this.sports = sports;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	

}