package String;

import java.util.Scanner;

/*
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.

Mississipi
--
?


 * 
 * */
public class Word_Study_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine().toUpperCase();
		int[] array = new int[26]; //���ĺ� ���� �������� ����
		int max = 0;
		boolean b = true;
		int index=0;
		int result=0;
		
		for(int i=0; i<st.length(); i++) {
			index=st.charAt(i)-'A';
			++array[index]; 
			if(array[index]>max) {
				max = array[index];
				result = index;
				b= true;
			}
			else if(array[index]==max) {
				b = false;
			}
		}
		
		if(b) {
			System.out.println((char)(result+'A'));
		}else {
			System.out.println("?");
		}
	}
}
