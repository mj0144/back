package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. 
���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��.
 ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ�� 2����~15���ڷ� �̷���� �ִ�.
*
ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ð��� ����Ѵ�.
*
UNUCIC
--
36
 * */
public class Dial {
	public static void main(String[] args) throws IOException {
		// 2: abc, 3:def, 4:ghi, 5:jkl, 6:mno, 7:pqrs, 8: tuv, 9:wxyz
		// �ð� �ʴ� �� ���̾��ȣ+1��.
		// a:65
		int[] alpha = new int[26];
		int value = 2;
		int count = 0;
		for (int i = 0; i < alpha.length; i++) {

			if (value == 7 || value == 9) {
				if (count <= 3) {
					alpha[i] = value;
					count++;
				} else {
					count = 0;
					value++;
					i--;
				}
			} else {
				if (count <= 2) {
					alpha[i] = value;
					count++;
				} else {
					count = 0;
					value++;
					i--;
				}
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		String st = sc.nextLine().toLowerCase();
//		String[] array = st.split("");
//		int result =0;
//		for(int i=0; i<array.length; i++) {
//			result += alpha[array[i].charAt(0)-'a']+1;
//		}
//		System.out.println(result);
		int result =0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine().toLowerCase();
		String[] array = st.split("");
		for(int i=0; i<array.length; i++) {
			result += alpha[array[i].charAt(0)-'a']+1;
		}
		System.out.println(result);
		
	}

}
