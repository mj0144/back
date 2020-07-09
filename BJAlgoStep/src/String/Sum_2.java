package String;

import java.util.Scanner;

/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

입력으로 주어진 숫자 N개의 합을 출력한다.

11
10987654321
----
46
 * 
 * */
public class Sum_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //입력할 갯수
		String st= sc.next();
//		String[] s = st.split("");
//		int sum=0;
//		for(String e:s)
//			sum+=Integer.parseInt(e);
//		System.out.println(sum);
		int sum=0;
		for(int i=0; i<n; i++) {
			sum += st.charAt(i)-'0'; //0을 빼거나 더함으로 써 연산을 사용하면. char형이 int형으로 변환되어 계산됨.
		}
		System.out.println(sum);
	}
}
/*
 int 형과 char 형에 + 또는 - 연산자를 사용할 경우 char형이 int 형으로 변환되어 계산됩니다.
 이를 활용하여 처리합니다.
 https://rightbellboy.tistory.com/29
 * 
 * */
 