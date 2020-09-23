 package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


/*
 N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
--입력---
첫째 줄에 자연수 N(1≤N≤100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
다음 줄에는 M(1≤M≤100,000)이 주어진다. 
다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
----출력---
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
---예제입력---
5
4 1 5 2 3
5
1 3 7 9 5
---예제출력---
1
1
0
0
1

 
 */


//비교를하는 대상과 비교를 당하는 대상의 수가 다를수 있는 것을 생각!!!!
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
		
		//정렬되어 있어야함.
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
		
		//정렬되어 있는 검색이니깐 binary Search		
		int mid=0;

		int searchNum=0;
		xx:for(int i=0; i<M.length; i++) {
			int start=0; //시작지점 인덱스.
			int end = A.length-1; //끝지점 인덱스
			searchNum = M[i];
			while(start <= end) {
				mid = (start+end)/2; //중간지점 인덱스
				if(searchNum<A[mid]) { //찾는 원소가 중간값보다 작을 때
					end = mid-1;
				}
				if(searchNum>A[mid]) { //찾는 원소가 중간값보다 클 때
					start = mid+1;
				}
				if(searchNum==A[mid]) { //찾을 때.
					result[i] = 1;
					continue xx;
				}
			}
			result[i] = 0; //못찾았을 때.
		}
		
		return result;
	}
	
	
	
}
