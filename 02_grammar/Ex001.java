class Ex001{
	public static void main(String[] args){
		
		String name = "팔용신전설";

		int str = 999;
		int dex = 999;
		int agi = 999;
		int vit = 999;
		int wis = 999;

		int sum = str + dex + agi + vit + wis;
		double evg = (int)(sum / 5.0 * 10) / 10.0;

		System.out.println("이름: " + name);
		System.out.println("힘: " + str);
		System.out.println("민첩: " + dex);
		System.out.println("기민: " + agi);
		System.out.println("체력: " + vit);
		System.out.println("지혜: " + wis);
		System.out.println("능력치 총합: " + sum);
		System.out.println("능력치 평균: " + evg);
		System.out.println("==================");
		
	}
}
