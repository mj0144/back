package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineCutting_1654 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int k = Integer.parseInt(st[0]); //������ ����
		Long n = Long.parseLong(st[1]); //�ʿ��� ���� ��
		
		Long[] line = new Long[k]; 
		long line_len_sum =0; //������ ����.
		
		long math_max = 0;
		for(int i=0; i<k; i++) {
			line[i] = Long.parseLong(br.readLine());
			//line_len_sum += line[i]; 
			math_max = Math.max(math_max, line[i]);

		}
		
		long min = 1;
		long max = math_max; // �ѱ���/�ʿ��� ���� => �� ���� �� ���� �� �ִ� �ִ����
		long mid =0;
		//long result = 0;
		
		while(min <= max) {
			mid = (mid+max)/2; //�� ���� �� ���� �� �ִ� ���� �� �߰���.
			
			
			
			long pice =0;

			for(long e : line) {
				pice += e/mid;//������ �ش� ����(mid)�� �߶��� �� ������ ������
			}
			

			if(pice >= n) {				
				min = mid+1; //������ ���� ���� �ٿ����ϱ� ������. ���̸� �÷�����.
				//result = mid;
			}else {//�� ������ �߶��� �� ���� �������� ���� �ʿ��� ������ ���� ���� ��.
				max = mid-1; // �� ���� ������ �ʿ��ϱ� ������. ���̸� �� �ٿ�����.

			}
			/*
			 * if(pice == n) { //�� ������ �߶��� �� ������ �������� �� == �ʿ��� ������ result = mid; //�׋��� ����
			 * break; }
			 */
			
		}
		System.out.println(max);
		//System.out.println(result);
		long end = System.currentTimeMillis();

		System.out.println( "���� �ð� : " + ( end - start )/1000.0 );



		
	}
}
