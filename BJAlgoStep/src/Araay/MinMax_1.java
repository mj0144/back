package Araay;

import java.util.Scanner;

/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 
 *
5
20 10 35 30 7
 * 
7 35
 * 
 * */
public class MinMax_1 {

	//sc로 배열크기 받고
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
		
		//arraylist로 하면 sort함수를 써서 금방 풀수 잇긴한데.
	
		System.out.println(min + " " + max);
		
		
		
	}
}
