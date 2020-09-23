package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/*
��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
�� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. 
�� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. 
���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. 
�׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. 
���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , 
�׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
 * */
/*
�Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 
�� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. 
�ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
--���--
����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 * */
/*
--�Է¿���--
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
---��¿���--
NO
NO
YES
NO
YES
NO
 * */
public class Bracket_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> result = new ArrayList<String>();

		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			Stack<String> stack = new Stack<String>();
			String bracket = br.readLine();
			for(String e : bracket.split("")) {
				if(stack.empty() || !(stack.peek().equals("(") && e.equals(")"))) {//���� ���̶� �����ֶ� top�� �������� ����.
					stack.add(e);
				}else {
					stack.pop();
				}

			}
			if(stack.empty()) {
				result.add("YES");
			}else {
				result.add("NO");
			}
			
		}
		
		for(String e : result)
			System.out.println(e);
	}
}
