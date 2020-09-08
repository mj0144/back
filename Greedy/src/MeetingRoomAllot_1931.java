import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 
단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 
회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 * 
 * 
첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 
둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 
시작 시간과 끝나는 시간은 2^31-1보다 작거나 같은 자연수 또는 0이다.
 * 
첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.
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
		int N = sc.nextInt(); // 회의개수
		int[][] allot = new int[N][2];

		for (int i = 0; i < N; i++) {
			allot[i][0] = sc.nextInt();
			allot[i][1] = sc.nextInt();
		}

		// 회의종료시간으로 정렬.
		Arrays.sort(allot, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// o1[0] : 시작시간, o1[1] : 종료시간
				// o2[0] : 비교할 시작시간, o2[1] : 비교할 종료시간
				// TODO Auto-generated method stub
				if (o1[1] == o2[1]) { // 두 시간이 같을때는 시작시간 기준으로 정렬
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}

		});

		int count = 0; // 회의개수
		int end = -1; // 종료시간

		for (int i = 0; i < N; i++) {
			if (allot[i][0] >= end) { // 시작시간이 종료시간보다 크거나 같아야.
				// 회의 선택
				count++;
				// 종료시간 업데이트.
				end = allot[i][1];
			}
		}

		System.out.println(count);

	}
}
