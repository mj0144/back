package String;

import java.util.Scanner;

/*
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. 
���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
 * 
ù° �ٿ� ����� ����� ����Ѵ�.
*
734 893
----
437
 * */
public class Constant_7 {
	public static void main(String[] args) {
		//���ڿ� ������ �Լ��� �־����Ͱ�����.
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		int a = Integer.parseInt(Constant_7.swap(A));
		int b = Integer.parseInt(Constant_7.swap(B));
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
	
		
	}
	
	public static String swap(String st) {
		char[] c = st.toCharArray();
		char temp = '0';
		temp = c[0];
		c[0] = c[2];
		c[2] = temp;
		st = String.valueOf(c);
		return st;
	}
}


/*
  public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println(A>B ? A:B);
    }
 
 * */
