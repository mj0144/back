import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
�� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. 
�� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���. 
��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. 
ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�. �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.
 * 
 * 
ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����. 
��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. 
���� �ð��� ������ �ð��� 2^31-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * 
ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
 * 
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
------
4
 * 
 * */

public class MeetingRoomAllot_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ȸ�ǰ���
		int[][] allot = new int[N][2];

		for (int i = 0; i < N; i++) {
			allot[i][0] = sc.nextInt();
			allot[i][1] = sc.nextInt();
		}

		// ȸ������ð����� ����.
		Arrays.sort(allot, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// o1[0] : ���۽ð�, o1[1] : ����ð�
				// o2[0] : ���� ���۽ð�, o2[1] : ���� ����ð�
				// TODO Auto-generated method stub
				if (o1[1] == o2[1]) { // �� �ð��� �������� ���۽ð� �������� ����
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}

		});

		int count = 0; // ȸ�ǰ���
		int end = -1; // ����ð�

		for (int i = 0; i < N; i++) {
			if (allot[i][0] >= end) { // ���۽ð��� ����ð����� ũ�ų� ���ƾ�.
				// ȸ�� ����
				count++;
				// ����ð� ������Ʈ.
				end = allot[i][1];
			}
		}

		System.out.println(count);

	}
}
