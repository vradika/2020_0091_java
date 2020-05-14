import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		int i = 0;
		while (i < name.length) {
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어: ");
			kor[i] = sc.nextInt();
			System.out.print("영어: ");
			eng[i] = sc.nextInt();
			System.out.print("수학: ");
			mat[i] = sc.nextInt();
		i++;
			}
		i = 0;
		while (i < rank.length) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (int)(sum[i]/3.0*10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점"; 
			}
		i++;	
		}
		i = 0;
		while (i < rank.length) {
			int j = 0;
			while (j < rank.length) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			j++;
			}
		i++;	
		}
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		i = 0;
		while (i < rank.length) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "\t");
		i++;
		}
	}
}
