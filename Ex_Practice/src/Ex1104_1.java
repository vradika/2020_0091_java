
public class Ex1104_1 {
	private String name;
	private int sum;
	private String hak;
	private double avg;
	private int rank = 1;
	
	public Ex1104_1() {
		// TODO Auto-generated constructor stub
	}

	public Ex1104_1(String name, int sum, String hak, double avg, int rank) {
		super();
		this.name = name;
		this.sum = sum;
		this.hak = hak;
		this.avg = avg;
		this.rank = rank;
	}
	
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		s_avg();
	}
	
	public void s_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
		s_hak();
	}
	
	public void s_hak() {
		if (avg > 90) {
			hak = "A학점!!";
		} else if (avg > 80) {
			hak = " B학점!!";
		} else if (avg > 70) {
			hak = "C학점!!";
		} else {
			hak = "F학점!!";
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

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
