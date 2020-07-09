package Araay;

import java.util.Scanner;

/*
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,
�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�. 
 
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

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
		//�� ���̽��� ����� ���ϰ�, �ش� ��պ��� ū����� ���� ���� ����� ��ձ�����.
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double[] result = new double[testcase];
		
		for(int i=0; i<testcase; i++) {
			int N = sc.nextInt(); //��� ��
			int[] array = new int[N]; //���� �迭
			int sum=0;
			for(int j=0; j<array.length;j++) {
				array[j] = sc.nextInt(); 
				sum += array[j];
			}
			double avg = sum/N; //��ü ���.
			int count=0; //��պ��� ���� ���
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


 