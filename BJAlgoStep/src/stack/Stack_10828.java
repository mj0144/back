package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

push X: ���� X�� ���ÿ� �ִ� �����̴�.
pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * */

/*
ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. 
�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 * */

/*
����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 * */
/*
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
 * */
/*
2
2
0
2
1
-1
0
1
-1
0
3
 * */
public class Stack_10828 {
	
	static List<Integer> stack = new ArrayList<Integer>();

	
	//push,pop,size,empty, top
	public static void main(String[] args) throws NumberFormatException, IOException {
		//���� ���� �����߾���?
		//FILO
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //��ɾ� Ƚ��
		int[] statusList = new int[n];
		for(int i=0; i<n; i++) {
			String st  = br.readLine(); //���
			int status=0;
			switch (st) {
			case "top":
				status = top();
				break;
			case "pop":
				status = pop();
				break;			
			case "size":
				status=size();
				break;
			case "empty":
				status=empty();
				break;
				
			default:
				int a = Integer.parseInt(st.split(" ")[1]);
				push(a);
				status=-2;
				break;
			}
				statusList[i] = status;
		}
		for(int e : statusList) {
			if(e != -2)
				System.out.println(e);

		}
		
	}
	
	//���� X�� ���ÿ� �ִ� �����̴�.
	public static void push(int a) {
		stack.add(a);
	}
	//������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ���
	public static int top() {
		if(empty() == 1) { //���� ��
			return -1;
		}else {
			return stack.get(stack.size()-1);
		}
	}
	//���ÿ� ����ִ� ������ ������ ����Ѵ�.
	public static int size() {
		return stack.size();
	}
	
	//������ ��������� 1, �ƴϸ� 0�� ���
	public static int empty() {
		if(stack.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ���
	public static int pop() {
		if(empty()==1) {
			return -1;
		}else {
			int top = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return top;
		}
		
	}
	
	
}
