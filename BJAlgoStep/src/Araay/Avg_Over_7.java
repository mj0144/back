package Araay;

import java.util.Scanner;

/*
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다. 
 
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 
40.000%
57.143%
33.333%
66.667%
55.556% 
 * */
public class Avg_Over_7 {
	public static void main(String[] args) {
		//각 케이스의 평균을 구하고, 해당 평균보다 큰사람을 수를 구해 사람수 평균구하지.
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double[] result = new double[testcase];
		
		for(int i=0; i<testcase; i++) {
			int N = sc.nextInt(); //사람 수
			int[] array = new int[N]; //점수 배열
			int sum=0;
			for(int j=0; j<array.length;j++) {
				array[j] = sc.nextInt(); 
				sum += array[j];
			}
			double avg = sum/N; //전체 평균.
			int count=0; //평균보다 높은 사람
			for(int e : array) {
				if(e>avg) {
					count++;
				}
			}
			result[i]=((double)count/(double)N)*100;
			
			
		}
		
		for(double e : result)
			System.out.println(String.format("%.3f", e)+"%");
		
	}
}


 