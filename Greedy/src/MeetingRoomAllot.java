import java.util.ArrayList;
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

public class MeetingRoomAllot {
//�ϴ� ���� �ð��� ���� ������ �����ϰ�,
//24¥�� �迭�� �ش��ϴ� �ð���ŭ �ε����� 1�� ä��.
//���۽ð��� 1�� ������ ���� ����������, �� ���� �迭�� ���� 0�̿�����.
//���� ä������ count++, ������ count--�� ó��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[24];
		int count=0;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<N; i++) {
			ArrayList<Integer> timeList = new ArrayList<Integer>();
			int start = sc.nextInt();
			int end = sc.nextInt();
			timeList.add(start);
			timeList.add(end);
			timeList.add(end-start);
			list.add(timeList);
		}
		
		
		
		
	}
}
