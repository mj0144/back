package BinaraySearch;

import java.util.Scanner;

public class NumCard2_test {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int[] num = new int[20000001]; 
		int n = sc.nextInt(); 
		
		//숫자를 받는 동시에 각 숫자를 카운팅
		//ex) 6을 입력받았으면 10000006번쨰 인덱스의 값이 하나 올라감.
		for(int i=0; i<n; i++) 
			num[sc.nextInt()+10000000]++; 
		int m = sc.nextInt();
		
		//비교할 값의 인덱스의 값만 출력하면 됨.
		//ex) 10번을 입력받았으면, 10000010번째 인덱스 값을 출력하면 해당 숫자의 갯수를 나타냄.
		for(int i=0; i<m; i++) 
			System.out.print(num[sc.nextInt()+10000000]+" "); 
		}

}
