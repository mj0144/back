package Araay;

import java.util.Scanner;

/*
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 * 
 *
5
20 10 35 30 7
 * 
7 35
 * 
 * */
public class MinMax_1 {

	//sc�� �迭ũ�� �ް�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int min=1000001;
		int max=-1000001;
		
		for(int i=0;i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]<min) 
				min = array[i];
			
			if(array[i]>max)
				max = array[i];
		}
		
		//arraylist�� �ϸ� sort�Լ��� �Ἥ �ݹ� Ǯ�� �ձ��ѵ�.
	
		System.out.println(min + " " + max);
		
		
		
	}
}
