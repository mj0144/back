package String;

import java.util.Scanner;

/*
���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.

�Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.

A
---
65
 * 
 * */

public class ASCII_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//char a = s.charAt(0);
		char c = sc.nextLine().charAt(0);
		System.out.println(Integer.valueOf(c));
	}
}


//char->int => ����->�ƽ�Ű
//int->char => �ƽ�Ű->����
