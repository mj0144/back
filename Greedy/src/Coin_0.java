import java.util.Scanner;

/*
 * �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. �̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 ù° �ٿ� N�� K�� �־�����. (1 �� N �� 10, 1 �� K �� 100,000,000)
��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����. (1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)
 * 
ù° �ٿ� K���� ����µ� �ʿ��� ���� ������ �ּڰ��� ����Ѵ�.
 * 
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
-----
6
 * */
public class Coin_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ������ ����
		int K = sc.nextInt(); // ������ ��ġ�� ��
		int[] array = new int[N];
		int index = N-1;
		boolean first = true;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			if (first && K < array[i]) { // �Է¹��� ������ ��ġ�� ������ ��ġ�� �պ��� ���ʷ� ū���� �ε���.
				index = i;
				first = false;
			}
		}

		int count = 0;
		int temp = K;
		for (int i = index; i >= 0; i--) {
			count += temp / array[i]; // ��.= ����.
			temp = K % array[i];
		}
		System.out.println(count);

	}

}
