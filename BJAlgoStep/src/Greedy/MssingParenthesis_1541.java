package Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


/*
�����̴� ����� +, -, �׸��� ��ȣ�� ������ ���̰� �ִ� 50�� ���� �������. �׸��� ���� �����̴� ��ȣ�� ��� ������.
�׸��� ���� �����̴� ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ������� �Ѵ�.
��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.

----
ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�, 
���� ó���� ������ ���ڴ� �����̴�. 
�׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ����� ���� ���ӵǴ� ���ڴ� ����. 
���� 0���� ������ �� �ִ�.

--���--
ù° �ٿ� ������ ����Ѵ�.

---ex---
55-50+40
-35
---
'-'�� ����.
 * */
public class MssingParenthesis_1541 {
	public static void main(String[] args) throws IOException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String st = sc.nextLine();
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		
		String[] minus = st.split("\\-");
		String[] plus = new String[minus.length];
	

		ArrayList<Integer> plusResult = new ArrayList<Integer>();
		for (int i = 0; i < minus.length; i++) {
			int num = 0;

			plus = minus[i].split("\\+");

			for (String e : plus) {
				num += Integer.parseInt(e);
			}

			if (i == 0) {
				plusResult.add(num);
			} else {
				plusResult.add(num * -1);
			}
		}
		int result = 0;

		for (int e : plusResult) {
			result += e;
		}
		System.out.println(result);

	}
}
