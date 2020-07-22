package String;
/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 
 * 
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 
첫째 줄에 그룹 단어의 개수를 출력한다. 
 * 
 * 
3
happy
new
year
-----
3
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class checker_9 {
	public static void main(String[] args) throws IOException {
		//앞에 나왔떤 단어가 나오면 안되는거.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		String[] array= new String[testcase];
		for(int i=0; i<testcase; i++) {
			array[i] = br.readLine();
		}
		
		//연속된 단어는 제외하고, 또 나오는 알파벳을 어떻게 처리할거니 -> 처리한 것을 알려줄 boolean값이 있으면 좋겠다
		int count = 0;

		xx:for(int i=0; i<array.length; i++) { //테스트케이스만큼 돌거야.
			HashMap<String,Integer> map = new HashMap<String, Integer>();
			//boolean check = true;
			String[] alpha = new String[array[i].length()];
			int temp=0;
			String[] array2 = array[i].split("");
			Integer[] temp2 = new Integer[100];
			ArrayList<Integer> temp3 = new ArrayList<Integer>();
			for(int j=0; j<array2.length-1; j++) {
//				if(array2[j].equals(array2[j-1])){
//					map.put(array2[j-1], 1);
//				}
//				if(map.containsKey(array2[j])) {
//					//check = false;
//					break xx;
//				}
//				if(!map.containsKey(array2[j])) {
//					if(!array2[j].equals(array2[j+1])){
//						map.put(array2[j], 0);
//					}else {
//						map.put(array2[j], 1);		
//					}
//				}else {
//					if(!array2[j].equals(array2[j+1])){
//						map.put(array2[j], 0);
//					}
//				}
				if(!map.containsKey(array2[j])) {
					if(!array2[j].equals(array2[j+1])){
						map.put(array2[j], 0);
					}else {
						temp3.add(1); //연속된 수의 시작.		
					}
				}else {
					if(!array2[j].equals(array2[j+1])){
						map.put(array2[j], 0);
					}else {
						temp3.add(1);
					}
				}
			}
			count++;
		}
		System.out.println(count);

		
	}
}
