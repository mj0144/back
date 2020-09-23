 package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


/*
 N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
--�Է�---
ù° �ٿ� �ڿ��� N(1��N��100,000)�� �־�����. ���� �ٿ��� N���� ���� A[1], A[2], ��, A[N]�� �־�����. 
���� �ٿ��� M(1��M��100,000)�� �־�����. 
���� �ٿ��� M���� ������ �־����µ�, �� ������ A�ȿ� �����ϴ��� �˾Ƴ��� �ȴ�. 
��� ������ ������ -231 ���� ũ�ų� ���� 231���� �۴�.
----���---
M���� �ٿ� ���� ����Ѵ�. �����ϸ� 1��, �������� ������ 0�� ����Ѵ�.
---�����Է�---
5
4 1 5 2 3
5
1 3 7 9 5
---�������---
1
1
0
0
1

 
 */


//�񱳸��ϴ� ���� �񱳸� ���ϴ� ����� ���� �ٸ��� �ִ� ���� ����!!!!
public class SearchNum_1920 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a_len = Integer.parseInt(br.readLine());
		String a = br.readLine();
		String[] a_split = a.split(" ");
		int[] A = new int[a_len];
		for(int i=0; i<a_split.length; i++) {
			A[i] = Integer.parseInt(a_split[i]);
		}
		
		//���ĵǾ� �־����.
		Arrays.sort(A);
		
		
		int m_len = Integer.parseInt(br.readLine());
		String m = br.readLine();
		String[] m_split = m.split(" ");
		int[] M = new int[m_split.length];
		for(int i=0; i<m_split.length; i++) {
			M[i] = Integer.parseInt(m_split[i]);
		}
		
		
		int[] result = BinarySearch(M, A);
		
		for(int e : result) {
			System.out.println(e);
		}
		
		
	}
	
	
	public static int[] BinarySearch(int[] M, int[] A) {
		int[] result = new int[M.length];
		
		//���ĵǾ� �ִ� �˻��̴ϱ� binary Search		
		int mid=0;

		int searchNum=0;
		xx:for(int i=0; i<M.length; i++) {
			int start=0; //�������� �ε���.
			int end = A.length-1; //������ �ε���
			searchNum = M[i];
			while(start <= end) {
				mid = (start+end)/2; //�߰����� �ε���
				if(searchNum<A[mid]) { //ã�� ���Ұ� �߰������� ���� ��
					end = mid-1;
				}
				if(searchNum>A[mid]) { //ã�� ���Ұ� �߰������� Ŭ ��
					start = mid+1;
				}
				if(searchNum==A[mid]) { //ã�� ��.
					result[i] = 1;
					continue xx;
				}
			}
			result[i] = 0; //��ã���� ��.
		}
		
		return result;
	}
	
	
	
}
