package Araay;

import java.util.Scanner;

/*
 �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.

ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. 
���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.

150
266
427
-----
3
1
0
2
0
0
0
2
0
0

 * */

//ī��Ʈ�� �� ũ�� 10¥�� �迭.
//A,B,C ����.
//counting sort
//

public class NumCount_3 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc .nextInt();
		//���� ������� ��� �ϳ��� �ɰ���?
		//result -> string -> int?
		String[] st = String.valueOf(A*B*C).split("");

		for(int i=0; i<st.length; i++) {
			array[Integer.parseInt(st[i])]++;			
			//��������.
			//st�ȿ� ���� array�迭�� �ε����� �־ �ش� array�迭 �ε����� ���� ++
		}
		
		for(int e : array)
			System.out.println(e);
		
		
	}

}
