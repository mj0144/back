package String;

import java.util.Scanner;

/*
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
�� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. 
S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.

2
3 ABC
5 /HTP
---
AAABBBCCC
/////HHHHHTTTTTPPPPP
 * 
 * 
 * */
public class String_Repeat_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt(); //�׽�Ʈ���̽�
		String[] result = new String[testcase]; //������ ��� count
				
		for(int i=0; i<testcase; i++) {
			int n = sc.nextInt(); //�ݺ��� Ƚ��
			String st = sc.next().trim();
			String[] s = st.split("");
			result[i]="";
			for(String e : s) {
				for(int j=0; j<n; j++) {
					result[i]+=e;
				}
			}
		}
		
		for(String e : result)
			System.out.println(e);
		sc.close();
	}
}

//���̽㿡���� ���ڿ� �ݺ��� * ����..?
