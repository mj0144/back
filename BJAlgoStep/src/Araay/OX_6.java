package Araay;

import java.util.Scanner;

/*
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
  
 ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
 �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, 
 ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�. 
 
 �� �׽�Ʈ ���̽����� ������ ����Ѵ�.

5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
--------------------
10
9
7
55
30
 *
 * */

//�׽�Ʈ ���̽���ŭ for���� ���ƾ߰ڳ�
//count�� ���� 1�̻��̸� ��� count.
//�������� ������ ��� count. �ƴ϶�� 0���� �ʱ�ȭ.
public class OX_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] result = new int[testcase];
		
		
		for(int i=0; i<testcase; i++) {
			String st = sc.next(); //nextLine�̸� �ѹ� �ǳʶٰ� ����ǰ�, next���� �� ����ǳ�?
			String[] sp = st.split("");
			int count=0; //���� "O"�� ������ �ű� ����.
			int sum=0;
			String temp=""; //�������� ������ �ӽú���.
			for(String s : sp) {
				if(s.equals("O")) {
					
					if(temp.equals(s)) { //�������� ���簪�� ���ٸ�. ���ӵ� ���ڴϱ�.
						count++;
					}else {
						count=1;
					}
					sum += count;
					temp = s;
				}else {
					temp=s;
				}
			}
			result[i] = sum;
		}
		
		for(int e : result)
			System.out.println(e);
		
	}

}


/*
nextInt() �޼ҵ� ������ nextLine() �޼ҵ带 �����Ϸ��� �Ҷ� nextLine()�޼ҵ尡 �׳� �Ѿ������ ������ ���ܳ���.
  �� ������ nextInt()�޼ҵ带 ���� �� �� 20�� �ֿܼ� �Է��ϰ� ���͸� ������ 20�� ���Ͻ������� Enter���� �״�� �����ִ�
nextLine() �޼ҵ�� Enter���� �������� �޼ҵ带 �����Ű�� ������
 nextLine()�޼ҵ尡 ����� �� �����ִ� Enter���� �״�� �о� �ٷ� ����� ���̴�. 
 �׷��� ù��° ���ڿ��Է�: �� �Ѿ�� �ι�° �����Է�: �� ��µ� ���̴�.
���� ������  �Է��ϰ� �״��� ���ڸ� �Է��Ϸ��� �� �� next() �޼ҵ带 ����Ͽ��� �Ѵ�. 
 �ƴϸ� ���� nextLine()�޼ҵ带 �ѹ��� ���༭ enter���� ��������Ѵ�.

��ó: https://deftkang.tistory.com/55 [deftkang�� IT]

 * */

