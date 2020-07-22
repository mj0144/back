package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



/*
크로아티아 알파벳	변경
	c=
	c-
dz	dz=
d	d-
lj	lj
nj	nj
	s=
	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 
몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * 
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 * 
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * 
 ljes=njak
 ----
 6
*/
public class Croatia_8 {
	public static void main(String[] args) throws IOException {
		// c,s,z는 =가 붙어 있으면 하나 취급.
		// c는 -도 하나 취급.
		// lj, nj, dz도 하나 취급
		//알파벳 수를 구하는 거니깐..


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine().trim();
		String[] count = {"c-","c=","s=","dz=","lj","nj","z=","d-"};
				

		for(int i=0; i<count.length; i++) {
			if(st.contains(count[i])) {
				st = st.replace(count[i], "*");
			}
		}
		
		System.out.println(st.length());
		
		
		
//		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String st = br.readLine();
//		String[] array = st.split("");
//		ArrayList<String> count = new ArrayList<String>();
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("c", "=");
//		map.put("s", "=");
//		map.put("z", "=");
//		map.put("l", "j");
//		map.put("n", "j");
//		map.put("d", "z=");
//		map.put("d-", "-");
//		int j=0;
//		for(int i=0; i<array.length; i++) {
//			if(i+1<array.length) {
//				j = i+1;
//			}
//			if(map.containsKey(array[i])) {
//				if(array[j].equals(map.get(array[i]))){
//					if(!count.contains(array[i])) {
//						count.add(array[i]);
//					}
//					if(array[i].length()>1) {
//						i+=2;
//					}else {
//						i++;
//					}
//					continue;
//				}
//			}
//			count.add(array[i]);
//		}
//		for(String e : count)
//			System.out.println(e);
//		System.out.println(count.size());		
		
		
		
		
		
		
		
		
		
		
		
		
//*****************************************************************************************//		
		
//		for (int i = 0; i < array.length; i++) {
//			if ((array[i].equals("c") | array[i].equals("s") | array[i].equals("z")) && array[i+1].equals("=")) {
//				count++;
//				i++;	
//				continue;
//			}
//			else if (array[i].equals("c") && array[i+1].equals("-")) {
//				count++;
//				i++;
//				continue;
//			}
//			else if (array[i].equals("l") && array[i+1].equals("j")) {
//				count++;
//				i++;	
//				continue;
//			}
//			else if (array[i].equals("n") && array[i+1].equals("j")) {
//				count++;
//				i++;	
//				continue;
//			}
//			else if (array[i].equals("d") && array[i+1].equals("z")) {
//				count++;
//				i++;	
//				continue;
//			}
//			
//				count++;
//			
//			
//		}
//		System.out.println(count);
		
		
	}
}
