package Araay;

import java.util.Scanner;

/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */

public class Max_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int max=0; //범위가 자연수니깐
		int index=0;
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]>max) {
				max = array[i];
				index= i+1; //번째니깐 인덱스보다 하나 커야함.
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}
