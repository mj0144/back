package BinaraySearch;

import java.util.Scanner;

public class NumCard2_test {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int[] num = new int[20000001]; 
		int n = sc.nextInt(); 
		
		//���ڸ� �޴� ���ÿ� �� ���ڸ� ī����
		//ex) 6�� �Է¹޾����� 10000006���� �ε����� ���� �ϳ� �ö�.
		for(int i=0; i<n; i++) 
			num[sc.nextInt()+10000000]++; 
		int m = sc.nextInt();
		
		//���� ���� �ε����� ���� ����ϸ� ��.
		//ex) 10���� �Է¹޾�����, 10000010��° �ε��� ���� ����ϸ� �ش� ������ ������ ��Ÿ��.
		for(int i=0; i<m; i++) 
			System.out.print(num[sc.nextInt()+10000000]+" "); 
		}

}
