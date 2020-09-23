package BinaraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineCutting_1654 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int k = Integer.parseInt(st[0]); //랜선의 개수
		Long n = Long.parseLong(st[1]); //필요한 조각 수
		
		Long[] line = new Long[k]; 
		long line_len_sum =0; //랜선의 총합.
		
		long math_max = 0;
		for(int i=0; i<k; i++) {
			line[i] = Long.parseLong(br.readLine());
			//line_len_sum += line[i]; 
			math_max = Math.max(math_max, line[i]);

		}
		
		long min = 1;
		long max = math_max; // 총길이/필요한 조각 => 한 조각 당 나올 수 있는 최대길이
		long mid =0;
		//long result = 0;
		
		while(min <= max) {
			mid = (mid+max)/2; //한 조각 당 나올 수 있는 길이 중 중간값.
			
			
			
			long pice =0;

			for(long e : line) {
				pice += e/mid;//랜선을 해당 길이(mid)로 잘랐을 때 나오는 조각수
			}
			

			if(pice >= n) {				
				min = mid+1; //나오는 조각 수를 줄여야하기 때문에. 길이를 늘려야함.
				//result = mid;
			}else {//각 랜선을 잘랐을 떄 나온 조각들의 합이 필요한 조각수 보다 작을 때.
				max = mid-1; // 더 많은 조각이 필요하기 때문에. 길이를 더 줄여야함.

			}
			/*
			 * if(pice == n) { //각 랜선을 잘랏을 때 나오는 조각들의 합 == 필요한 조각수 result = mid; //그떄의 길이
			 * break; }
			 */
			
		}
		System.out.println(max);
		//System.out.println(result);
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );



		
	}
}
