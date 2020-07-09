package String;

import java.util.Scanner;

/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.

첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

Mississipi
--
?


 * 
 * */
public class Word_Study_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine().toUpperCase();
		int[] array = new int[26]; //알파벳 갯수 세기위한 베열
		int max = 0;
		boolean b = true;
		int index=0;
		int result=0;
		
		for(int i=0; i<st.length(); i++) {
			index=st.charAt(i)-'A';
			++array[index]; 
			if(array[index]>max) {
				max = array[index];
				result = index;
				b= true;
			}
			else if(array[index]==max) {
				b = false;
			}
		}
		
		if(b) {
			System.out.println((char)(result+'A'));
		}else {
			System.out.println("?");
		}
	}
}
