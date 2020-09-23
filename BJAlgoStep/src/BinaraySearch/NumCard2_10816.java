package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. 
����̴� ���� ī�� N���� ������ �ִ�. ���� M���� �־����� ��, 
�� ���� �����ִ� ���� ī�带 ����̰� �� �� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

-------�Է�-------------
ù° �ٿ� ����̰� ������ �ִ� ���� ī���� ���� N(1 �� N �� 500,000)�� �־�����. 
��° �ٿ��� ���� ī�忡 �����ִ� ������ �־�����. 
���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.

��° �ٿ��� M(1 �� M �� 500,000)�� �־�����. 
��° �ٿ��� ����̰� �� �� ������ �ִ� ���� ī������ ���ؾ� �� M���� ������ �־�����, 
�� ���� �������� ���еǾ��� �ִ�. �� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.

---���----
ù° �ٿ� �Է����� �־��� M���� ���� ���ؼ�, �� ���� ���� ���� ī�带 ����̰� �� �� ������ �ִ����� �������� ������ ����Ѵ�.

------�����Է�---
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
----���� ��� ----
3 0 0 1 2 0 0 2

 * */

public class NumCard2_10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N_count = Integer.parseInt(br.readLine()); // ���� ī�尳��
		String N = br.readLine(); // �� ī�忡 ���� ���ڵ�.
		String[] n_spilt = N.split(" ");
		int[] N_nums = new int[N_count];
		for (int i = 0; i < N_count; i++) {
			N_nums[i] = Integer.parseInt(n_spilt[i]);
		}

		// ����
		Arrays.sort(N_nums);

		int M_count = Integer.parseInt(br.readLine()); // ���ؾ��� ī�尳��
		int[][] result = new int[2][M_count]; // ������� ���� 2�����迭.
		String M = br.readLine(); //// ���ؾ��� ī�忡 ���� ��ȣ��.
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
				
				if (searchNum < N_nums[mid]) { //�񱳰��� ���غ��� ���� ��.
					end = mid - 1;
				}
				if (searchNum > N_nums[mid]) { //�񱳰��� ���غ��� Ŭ��.
					start = mid + 1;
				}
				if (searchNum == N_nums[mid]) {
					result[1][i] += 1; //�ϴ� �����ϱ�.
					int basic = mid;
					int pre = basic - 1;
					int next = basic + 1; 
					while (!(pre < 0 | next >= N_count)) {
						if (N_nums[pre] == N_nums[basic] && N_nums[next] == N_nums[basic]) { // �յڷ� ���ٸ�
							basic = pre; // ���ذ��� ������ �ű��.
							continue;
						} else {
							if (N_nums[pre] == N_nums[basic]) { // �տ� ���� ���ٸ�
								result[1][i] += 1; // �ش簪 ī��Ʈ
								basic = pre;
								pre = basic - 1;
								
							} else if (N_nums[next] == N_nums[basic]) { // �ڿ� ���� ���ٸ�
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
