package String;

import java.util.Scanner;

/*
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

�Է����� �־��� ���� N���� ���� ����Ѵ�.

11
10987654321
----
46
 * 
 * */
public class Sum_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�Է��� ����
		String st= sc.next();
//		String[] s = st.split("");
//		int sum=0;
//		for(String e:s)
//			sum+=Integer.parseInt(e);
//		System.out.println(sum);
		int sum=0;
		for(int i=0; i<n; i++) {
			sum += st.charAt(i)-'0'; //0�� ���ų� �������� �� ������ ����ϸ�. char���� int������ ��ȯ�Ǿ� ����.
		}
		System.out.println(sum);
	}
}
/*
 int ���� char ���� + �Ǵ� - �����ڸ� ����� ��� char���� int ������ ��ȯ�Ǿ� ���˴ϴ�.
 �̸� Ȱ���Ͽ� ó���մϴ�.
 https://rightbellboy.tistory.com/29
 * 
 * */
 