package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 
이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

-------입력-------------
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 
숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 
넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 
이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

---출력----
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

------예제입력---
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
----예제 출력 ----
3 0 0 1 2 0 0 2

 * */

public class NumCard2_10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N_count = Integer.parseInt(br.readLine()); // 가진 카드개수
		String N = br.readLine(); // 각 카드에 적힌 숫자들.
		String[] n_spilt = N.split(" ");
		int[] N_nums = new int[N_count];
		for (int i = 0; i < N_count; i++) {
			N_nums[i] = Integer.parseInt(n_spilt[i]);
		}

		// 정렬
		Arrays.sort(N_nums);

		int M_count = Integer.parseInt(br.readLine()); // 구해야할 카드개수
		int[][] result = new int[2][M_count]; // 결과값을 담을 2차원배열.
		String M = br.readLine(); //// 구해야할 카드에 적힌 번호들.
		String[] M_spilt = M.split(" ");
		int[] M_nums = new int[M_count];
		for (int i = 0; i < M_count; i++) {
			M_nums[i] = Integer.parseInt(M_spilt[i]);
			result[0][i] = M_nums[i];
		}



		xx:for (int i = 0; i < M_count; i++) {
			int start = 0;
			int end = N_count - 1;
			int searchNum = M_nums[i];
			while (start <= end) {
				int mid = (start + end) / 2;
				
				if (searchNum < N_nums[mid]) { //비교값이 기준보다 작을 때.
					end = mid - 1;
				}
				if (searchNum > N_nums[mid]) { //비교값이 기준보다 클때.
					start = mid + 1;
				}
				if (searchNum == N_nums[mid]) {
					result[1][i] += 1; //일단 같으니깐.
					int basic = mid;
					int pre = basic - 1;
					int next = basic + 1; 
					while (!(pre < 0 | next >= N_count)) {
						if (N_nums[pre] == N_nums[basic] && N_nums[next] == N_nums[basic]) { // 앞뒤로 같다면
							basic = pre; // 기준값을 앞으로 옮기기.
							continue;
						} else {
							if (N_nums[pre] == N_nums[basic]) { // 앞에 값과 같다면
								result[1][i] += 1; // 해당값 카운트
								basic = pre;
								pre = basic - 1;
								
							} else if (N_nums[next] == N_nums[basic]) { // 뒤에 값과 같다면
								result[1][i] += 1;
								basic = next;
								next = basic + 1;
							} else {
								//result[1][i] += 1;
								continue xx;
							}
						}

					}
					continue xx;

				}
			}
		}
		
		
		for(int i=0; i<M_count; i++) {
			System.out.print(result[1][i] + " ");
		}

	}
}
