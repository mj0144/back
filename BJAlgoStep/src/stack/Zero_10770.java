package stack;
/*
���ڴ� ���� ����̴� ���Ƹ� ȸ���� �غ��ϱ� ���ؼ� ��θ� �����ϴ� ���̴�.

�����̴� ����̸� ���ͼ� ���� �����ϴ� ���ε�, �ּ��ϰԵ� �׻� ���ž��� �����̴� ���� �Ǽ��� �߸� �θ��� ��� ġ�� �Ͼ�����.

�����̴� �߸��� ���� �θ� ������ 0�� ���ļ�, ���� �ֱٿ� ����̰� �� ���� ����� ��Ų��.

����̴� �̷��� ��� ���� �޾� ���� �� �� ���� ���� �˰� �;� �Ѵ�. ����̸� ��������!
 * */
/*
ù ��° �ٿ� ���� K�� �־�����. (1 �� K �� 100,000)

���� K���� �ٿ� ������ 1���� �־�����. ������ 0���� 1,000,000 ������ ���� ������, 
������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.

������ "0"�� ��쿡 ���� �� �ִ� ���� ������ ������ �� �ִ�.
 * */
/*
����̰� ���������� ���� �� ���� ���� ����Ѵ�. ���������� ��� ���� ���� 231-1���� �۰ų� ���� �����̴�.
--�Է�--
4
3
0
4
0
--���--
0
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class Zero_10770 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine()); // k��
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<k; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}else {
				stack.add(num);	
			}			
		}
		
		Iterator<Integer> iterator=stack.iterator();
		int result = 0;
		while(iterator.hasNext()) {
			result+=iterator.next();
		}
		System.out.println(result);
		
	}
	
}
