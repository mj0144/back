package String;

import java.util.Scanner;

/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 
baekjoon
---
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
	 
 * */

//알파벳은 26개
public class Alpha_Search_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine(); //단어
		String[] s = st.split(""); //하나씩 쪼개서
		int[] n = new int[26]; //알파벳의 갯수를 담을 배열
		for(int i=0; i<n.length;i++)
			n[i]=-1;
		
		//아스키-a의 아스키문자(97) = n의 인덱스값.
		for(int i=0; i<s.length; i++) {
			if(n[(int)(s[i].charAt(0))-97] == -1) { //처음 등장한 위치 조건.
				n[(int)(s[i].charAt(0))-97] = i;
			}
		}
		
		for(int e : n)
			System.out.print(e+" ");
		
	}
}

//배열을 한번에 초기화시키는 방법은 없나...