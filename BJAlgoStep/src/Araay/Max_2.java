package Araay;

import java.util.Scanner;

/*
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� �ٸ� 9���� �ڿ���
3, 29, 38, 12, 57, 74, 40, 85, 61
�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
 */

public class Max_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int max=0; //������ �ڿ����ϱ�
		int index=0;
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i]>max) {
				max = array[i];
				index= i+1; //��°�ϱ� �ε������� �ϳ� Ŀ����.
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}
