import java.util.ArrayList;
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

public class MeetingRoomAllot {
//일단 가장 시간이 적은 순으로 나열하고,
//24짜리 배열에 해당하는 시간만큼 인덱스를 1로 채움.
//시작시간이 1로 차였는 것은 가능하지만, 그 외의 배열의 값은 0이여야함.
//값이 채워지면 count++, 빠지면 count--로 처리
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
