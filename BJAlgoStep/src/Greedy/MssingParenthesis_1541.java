package Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


/*
세준이는 양수와 +, -, 그리고 괄호를 가지고 길이가 최대 50인 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

----
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 
가장 처음과 마지막 문자는 숫자이다. 
그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 
수는 0으로 시작할 수 있다.

--출력--
첫째 줄에 정답을 출력한다.

---ex---
55-50+40
-35
---
'-'가 기준.
 * */
public class MssingParenthesis_1541 {
	public static void main(String[] args) throws IOException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String st = sc.nextLine();
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		
		String[] minus = st.split("\\-");
		String[] plus = new String[minus.length];
	

		ArrayList<Integer> plusResult = new ArrayList<Integer>();
		for (int i = 0; i < minus.length; i++) {
			int num = 0;

			plus = minus[i].split("\\+");

			for (String e : plus) {
				num += Integer.parseInt(e);
			}

			if (i == 0) {
				plusResult.add(num);
			} else {
				plusResult.add(num * -1);
			}
		}
		int result = 0;

		for (int e : plusResult) {
			result += e;
		}
		System.out.println(result);

	}
}
