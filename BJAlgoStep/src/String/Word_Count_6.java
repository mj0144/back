package String;

import java.util.Scanner;

/*
���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. 
�� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 * 
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 
�ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�. 


The Curious Case of Benjamin Button
---
6
 * */

public class Word_Count_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] array = st.split(" ");
		int count=0;
		for(String e : array) {
			if(!e.equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
