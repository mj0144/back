package Araay;

import java.util.Scanner;

/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오. 
  
 첫째 줄에 테스트 케이스의 개수가 주어진다. 
 각 테스트 케이스는 한 줄로 이루어져 있고, 
 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다. 
 
 각 테스트 케이스마다 점수를 출력한다.

5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
--------------------
10
9
7
55
30
 *
 * */

//테스트 케이스만큼 for문이 돌아야겠네
//count한 값이 1이상이면 계속 count.
//이전값과 같으면 계속 count. 아니라면 0으로 초기화.
public class OX_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] result = new int[testcase];
		
		
		for(int i=0; i<testcase; i++) {
			String st = sc.next(); //nextLine이면 한번 건너뛰고 실행되고, next여야 다 실행되네?
			String[] sp = st.split("");
			int count=0; //문자 "O"의 점수를 매길 변수.
			int sum=0;
			String temp=""; //이전값을 저장할 임시변수.
			for(String s : sp) {
				if(s.equals("O")) {
					
					if(temp.equals(s)) { //이전값과 현재값이 같다면. 연속된 문자니깐.
						count++;
					}else {
						count=1;
					}
					sum += count;
					temp = s;
				}else {
					temp=s;
				}
			}
			result[i] = sum;
		}
		
		for(int e : result)
			System.out.println(e);
		
	}

}


/*
nextInt() 메소드 다음에 nextLine() 메소드를 실행하려고 할때 nextLine()메소드가 그냥 넘어가버리는 오류가 생겨난다.
  이 이유는 nextInt()메소드를 실행 할 때 20을 콘솔에 입력하고 엔터를 누를때 20을 리턴시켰지만 Enter값은 그대로 남아있다
nextLine() 메소드는 Enter값을 기준으로 메소드를 종료시키기 때문에
 nextLine()메소드가 실행될 때 남아있는 Enter값을 그대로 읽어 바로 종료된 것이다. 
 그래서 첫번째 문자열입력: 이 넘어가고 두번째 정수입력: 이 출력된 것이다.
만약 정수를  입력하고 그다음 문자를 입력하려고 할 때 next() 메소드를 사용하여야 한다. 
 아니면 위에 nextLine()메소드를 한번더 써줘서 enter값을 없애줘야한다.

출처: https://deftkang.tistory.com/55 [deftkang의 IT]

 * */

